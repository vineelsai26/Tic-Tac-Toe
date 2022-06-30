package com.vs.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SelectMode extends AppCompatActivity {
    TextView txtVselect, txtVinfo;
    Button btnClassic, btnUnbeatable ;
    ImageView imgInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mode);

        txtVselect = findViewById(R.id.txtVselect);
        txtVinfo = findViewById(R.id.txtVinfo);
        btnClassic = findViewById(R.id.btnClassic);
        btnUnbeatable = findViewById(R.id.btnUnbeatable);
        imgInfo = findViewById(R.id.imgInfo);
        btnClassic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SelectMode.this, SinglePlayerActivity.class);
                intent1.putExtra("mode","classic");
                startActivity(intent1);
                finish();
            }
        });
        btnUnbeatable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SelectMode.this, SinglePlayerActivity.class);
                intent1.putExtra("mode","unbeatable");
                startActivity(intent1);
                finish();
            }
        });

    }
}