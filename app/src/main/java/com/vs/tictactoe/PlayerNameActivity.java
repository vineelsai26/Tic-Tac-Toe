package com.vs.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class PlayerNameActivity extends AppCompatActivity {
    public ImageButton btn;
    public static EditText p1,p2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);

        btn = findViewById(R.id.imgbtn);
        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayerNameActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
