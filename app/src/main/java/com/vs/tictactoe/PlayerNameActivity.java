package com.vs.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class PlayerNameActivity extends AppCompatActivity {
    public static EditText p1, p2, p;
    public Button Mul;
    public Button Sin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
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
                Intent intent2 = new Intent(PlayerNameActivity.this, SinglePlayerActivity.class);
                startActivity(intent2);
                finish();
            }
        });
    }
}