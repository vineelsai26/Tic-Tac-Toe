package com.vs.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;

import hotchemi.android.rate.AppRate;

public class SinglePlayerActivity extends AppCompatActivity {
    public ImageButton btnreset;
    public Button btnclear;
    public TextView txt1;
    public TextView txt2;
    public boolean P1, P2;
    public int count = 0;
    public int X, Y = 0;
    public String p, comp;
    public String initp, initcomp;
    public String stat1, stat2;
    private Button[] btn = new Button[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);

        AppRate.with(this)
                .setInstallDays(3)
                .setLaunchTimes(3)
                .setRemindInterval(3)
                .monitor();
        AppRate.showRateDialogIfMeetsConditions(this);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        P1 = true;
        for (int i = 0; i < 9; i++) {
            String ButtonId = "bt" + i;
            int resId = getResources().getIdentifier(ButtonId, "id", getPackageName());
            btn[i] = findViewById(resId);
            final int finalI = i;
            btn[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (P1 && btn[finalI].getText().equals("")) {
                        btn[finalI].setText("X");
                        P1 = false;
                        P2 = true;
                        count++;
                        win();
                        Draw();
                        computer();
                    }
                }
            });
        }

        txt1 = findViewById(R.id.text_view_p1);
        txt2 = findViewById(R.id.text_view_p2);
        btnreset = findViewById(R.id.btnreset);
        btnclear = findViewById(R.id.btnclear);
        p = PlayerNameActivity.p.getText().toString();
        if (p.equals("") || p.equals("Player")) {
            p = "Player ";
        }
        comp = "Computer ";
        initp = p + ": 0";
        initcomp = comp + ": 0";
        txt1.setText(initp);
        txt2.setText(initcomp);
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reset();
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear();
            }
        });
    }

    private void computer() {
        if (P2) {
            int i = findBestMove(0);
            if (btn[i].getText().equals("")) {
                btn[i].setText("O");
                P1 = true;
                P2 = false;
                count++;
                win();
                Draw();
            } else {
                computer();
            }

        }
    }

    private int findBestMove(int i) {
        for (; i < 3; i++) {
            if (btn[3 * i].getText().equals(btn[1 + 3 * i].getText()) && !btn[3 * i].getText().equals("") || btn[2 + 3 * i].getText().equals(btn[1 + 3 * i].getText()) && !btn[2 + 3 * i].getText().equals("") || btn[3 * i].getText().equals(btn[2 + 3 * i].getText()) && !btn[3 * i].getText().equals("")) {
                if (!btn[1 + 3 * i].getText().equals("")) {
                    if (btn[2 + 3 * i].getText().equals("")) {
                        return 2 + 3 * i;
                    } else if (btn[3 * i].getText().equals("")) {
                        return 3 * i;
                    }
                } else {
                    return 1 + 3 * i;
                }
            } else if (btn[i].getText().equals(btn[3 + i].getText()) && !btn[3 + i].getText().equals("") || btn[3 + i].getText().equals(btn[6 + i].getText()) && !btn[3 + i].getText().equals("") || btn[i].getText().equals(btn[6 + i].getText()) && !btn[i].getText().equals("")) {
                if (!btn[3 + i].getText().equals("")) {
                    if (btn[6 + i].getText().equals("")) {
                        return 6 + i;
                    } else if (btn[i].getText().equals("")) {
                        return i;
                    }
                } else {
                    return 3 + i;
                }
            } else if (btn[0].getText().equals(btn[4].getText()) && !btn[4].getText().equals("") || btn[4].getText().equals(btn[8].getText()) && !btn[4].getText().equals("") || btn[8].getText().equals(btn[0].getText()) && !btn[0].getText().equals("")) {
                if (!btn[4].getText().equals("")) {
                    if (btn[8].getText().equals("")) {
                        return 8;
                    } else if (btn[0].getText().equals("")) {
                        return 0;
                    }
                } else {
                    return 4;
                }
            } else if (btn[2].getText().equals(btn[4].getText()) && !btn[4].getText().equals("") || btn[4].getText().equals(btn[6].getText()) && !btn[4].getText().equals("") || btn[6].getText().equals(btn[2].getText()) && !btn[6].getText().equals("")) {
                if (!btn[4].getText().equals("")) {
                    if (btn[6].getText().equals("")) {
                        return 6;
                    } else if (btn[2].getText().equals("")) {
                        return 2;
                    }
                } else {
                    return 4;
                }
            } else {
                findBestMove(i + 1);
            }
        }
        return randomMove();
    }

    private int randomMove() {
        int ran = rand();
        if (btn[ran].getText().equals("")) {
            return ran;
        } else {
            randomMove();
        }
        return ran;
    }

    private int rand() {
        Random random = new Random();
        return random.nextInt(9);
    }

    private void Draw() {
        if (count == 9) {
            Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show();
            Clear();
        }
    }

    private void win() {
        if (btn[0].getText().equals(btn[1].getText()) && btn[1].getText().equals(btn[2].getText()) && btn[2].getText().equals("X") || btn[3].getText().equals(btn[4].getText()) && btn[4].getText().equals(btn[5].getText()) && btn[5].getText().equals("X") || btn[6].getText().equals(btn[7].getText()) && btn[7].getText().equals(btn[8].getText()) && btn[8].getText().equals("X") || btn[0].getText().equals(btn[3].getText()) && btn[3].getText().equals(btn[6].getText()) && btn[6].getText().equals("X") || btn[1].getText().equals(btn[4].getText()) && btn[4].getText().equals(btn[7].getText()) && btn[7].getText().equals("X") || btn[2].getText().equals(btn[5].getText()) && btn[5].getText().equals(btn[8].getText()) && btn[8].getText().equals("X") || btn[0].getText().equals(btn[4].getText()) && btn[4].getText().equals(btn[8].getText()) && btn[8].getText().equals("X") || btn[2].getText().equals(btn[4].getText()) && btn[4].getText().equals(btn[6].getText()) && btn[6].getText().equals("X")) {
            X++;
            Toast.makeText(this, p + " Won!", Toast.LENGTH_SHORT).show();
            stat1 = p + ": " + X;
            txt1.setText(stat1);
            Clear();
        } else if (btn[0].getText().equals(btn[1].getText()) && btn[1].getText().equals(btn[2].getText()) && btn[2].getText().equals("O") || btn[3].getText().equals(btn[4].getText()) && btn[4].getText().equals(btn[5].getText()) && btn[5].getText().equals("O") || btn[6].getText().equals(btn[7].getText()) && btn[7].getText().equals(btn[8].getText()) && btn[8].getText().equals("O") || btn[0].getText().equals(btn[3].getText()) && btn[3].getText().equals(btn[6].getText()) && btn[6].getText().equals("O") || btn[1].getText().equals(btn[4].getText()) && btn[4].getText().equals(btn[7].getText()) && btn[7].getText().equals("O") || btn[2].getText().equals(btn[5].getText()) && btn[5].getText().equals(btn[8].getText()) && btn[8].getText().equals("O") || btn[0].getText().equals(btn[4].getText()) && btn[4].getText().equals(btn[8].getText()) && btn[8].getText().equals("O") || btn[2].getText().equals(btn[4].getText()) && btn[4].getText().equals(btn[6].getText()) && btn[6].getText().equals("O")) {
            Y++;
            Toast.makeText(this, "Computer" + " Won!", Toast.LENGTH_SHORT).show();
            stat2 = "Computer : " + Y;
            txt2.setText(stat2);
            Clear();
        }
    }

    private void Reset() {
        Clear();
        txt1.setText(initp);
        txt2.setText(initcomp);
        X = 0;
        Y = 0;
    }

    private void Clear() {
        for (int i = 0; i < 9; i++) {
            btn[i].setText("");
        }
        count = 0;
        P1 = true;
        P2 = false;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SinglePlayerActivity.this, PlayerNameActivity.class);
        startActivity(intent);
        finish();
    }
}