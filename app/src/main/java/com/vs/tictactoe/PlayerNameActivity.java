package com.vs.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class PlayerNameActivity extends AppCompatActivity {
    public Button Mul;
    public Button Sin;
    public static EditText p1,p2,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);

        Mul = findViewById(R.id.imgbtn);
        Sin = findViewById(R.id.SinglePlayer);
        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p = findViewById(R.id.p);
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(PlayerNameActivity.this, MainActivity.class);
                startActivity(intent1);
                finish();
            }
        });
        Sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 =new Intent(PlayerNameActivity.this,SinglePlayerActivity.class);
                startActivity(intent2);
            }
        });
    }
}