package com.vs.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import hotchemi.android.rate.AppRate;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    public ImageButton btnreset;
    public TextView txt1;
    public TextView txt2;
    public boolean P1,P2;
    public int count = 0;
    public int X,Y = 0;
    public String p1,p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        AppRate.with(this)
                .setInstallDays(3)
                .setLaunchTimes(3)
                .setRemindInterval(3)
                .monitor();
        AppRate.showRateDialogIfMeetsConditions(this);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        txt1 = findViewById(R.id.text_view_p1);
        txt2 = findViewById(R.id.text_view_p2);
        btnreset = findViewById(R.id.btnreset);
        P1 = true;
        p1 = PlayerNameActivity.p1.getText().toString();
        p2 = PlayerNameActivity.p2.getText().toString();
        if (p1.equals("") || p1.equals("Player 1")){
            p1 = "Player 1";
        }
        if (p2.equals("") || p2.equals("Player 2")){
            p2 = "Player 2";
        }
        txt1.setText(p1 + ": 0");
        txt2.setText(p2 + ": 0");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn1.getText().equals("")){
                    btn1.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                }
                else if (btn1.getText().equals("")){
                    btn1.setText("O");
                    P2 = false;
                    P1 = true;
                    count++;
                }
                win();
                Draw();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn2.getText().equals("")){
                    btn2.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                }
                if (P2 && btn2.getText().equals("")){
                    btn2.setText("O");
                    P2 = false;
                    P1 = true;
                    count++;
                }
                win();
                Draw();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn3.getText().equals("")){
                    btn3.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                }
                if (P2 && btn3.getText().equals("")){
                    btn3.setText("O");
                    P2 = false;
                    P1 = true;
                    count++;
                }
                win();
                Draw();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn4.getText().equals("")){
                    btn4.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                }
                if (P2 && btn4.getText().equals("")){
                    btn4.setText("O");
                    P2 = false;
                    P1 = true;
                    count++;
                }
                win();
                Draw();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn5.getText().equals("")){
                    btn5.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                }
                if (P2 && btn5.getText().equals("")){
                    btn5.setText("O");
                    P2 = false;
                    P1 = true;
                    count++;
                }
                win();
                Draw();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn6.getText().equals("")){
                    btn6.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                }
                if (P2 && btn6.getText().equals("")){
                    btn6.setText("O");
                    P2 = false;
                    P1 = true;
                    count++;
                }
                win();
                Draw();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn7.getText().equals("")){
                    btn7.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                }
                if (P2 && btn7.getText().equals("")){
                    btn7.setText("O");
                    P2 = false;
                    P1 = true;
                    count++;
                }
                win();
                Draw();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn8.getText().equals("")){
                    btn8.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                }
                if (P2 && btn8.getText().equals("")){
                    btn8.setText("O");
                    P2 = false;
                    P1 = true;
                    count++;
                }
                win();
                Draw();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn9.getText().equals("")){
                    btn9.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                }
                if (P2 && btn9.getText().equals("")){
                    btn9.setText("O");
                    P2 = false;
                    P1 = true;
                    count++;
                }
                win();
                Draw();
            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reset();
            }
        });
    }
    private void Draw() {
        if (count == 9){
            Toast.makeText(this,"Draw",Toast.LENGTH_SHORT).show();
            Clear();
        }
    }
    private void win() {
        if ((btn1.getText().equals(btn2.getText()) && btn2.getText().equals(btn3.getText()) && btn3.getText().equals("X")) || (btn4.getText().equals(btn5.getText()) && btn5.getText().equals(btn6.getText()) && btn6.getText().equals("X")) || (btn7.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText()) && btn9.getText().equals("X")) || (btn1.getText().equals(btn4.getText()) && btn4.getText().equals(btn7.getText()) && btn7.getText().equals("X")) || (btn2.getText().equals(btn5.getText()) && btn5.getText().equals(btn8.getText()) && btn8.getText().equals("X")) || (btn3.getText().equals(btn6.getText()) && btn6.getText().equals(btn7.getText()) && btn7.getText().equals("X")) || (btn1.getText().equals(btn5.getText()) && btn5.getText().equals(btn9.getText()) && btn9.getText().equals("X")) || (btn3.getText().equals(btn5.getText()) && btn5.getText().equals(btn7.getText()) && btn7.getText().equals("X"))) {
            X++;
            Toast.makeText(this, p1 + " Won!", Toast.LENGTH_SHORT).show();
            txt1.setText(p1 + ": " + X);
            Clear();
        }
        if ((btn1.getText().equals(btn2.getText()) && btn2.getText().equals(btn3.getText()) && btn3.getText().equals("O")) || (btn4.getText().equals(btn5.getText()) && btn5.getText().equals(btn6.getText()) && btn6.getText().equals("O")) || (btn7.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText()) && btn9.getText().equals("O")) || (btn1.getText().equals(btn4.getText()) && btn4.getText().equals(btn7.getText()) && btn7.getText().equals("O")) || (btn2.getText().equals(btn5.getText()) && btn5.getText().equals(btn8.getText()) && btn8.getText().equals("O")) || (btn3.getText().equals(btn6.getText()) && btn6.getText().equals(btn7.getText()) && btn7.getText().equals("O")) || (btn1.getText().equals(btn5.getText()) && btn5.getText().equals(btn9.getText()) && btn9.getText().equals("O")) || (btn3.getText().equals(btn5.getText()) && btn5.getText().equals(btn7.getText()) && btn7.getText().equals("O"))) {
            Y++;
            Toast.makeText(this, p2 + " Won!", Toast.LENGTH_SHORT).show();
            txt2.setText(p2 + ": " + Y);
            Clear();
        }
    }
    private void Reset() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        txt1.setText(p1 + ": 0");
        txt2.setText(p2 + ": 0");
        P1 = true;
        X = 0;
        Y = 0;
    }
    private void Clear() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        P1 = true;
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MainActivity.this,PlayerNameActivity.class);
        startActivity(intent);
        finish();
    }

}