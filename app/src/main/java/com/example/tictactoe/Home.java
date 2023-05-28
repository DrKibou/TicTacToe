package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tictactoe.VsPlayer.AddPlayers;

public class Home extends AppCompatActivity {

    Button mpBtn, aiBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mpBtn = (Button) findViewById(R.id.mpBtn);
        aiBtn = (Button) findViewById(R.id.aiBtn);

        mpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            openMulti();
            }
        });

        aiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void openAi(){
        Intent intent = new Intent();
    }
    public void openMulti(){
        Intent intent = new Intent(getApplicationContext(), AddPlayers.class);
        startActivity(intent);
        finish();
    }

}