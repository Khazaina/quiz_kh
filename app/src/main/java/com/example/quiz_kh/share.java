package com.example.quiz_kh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class share extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        TextView score_view;
        Button share,home1;
        score_view=findViewById(R.id.score_view);
        Intent intent = getIntent();
        score_view.setText(intent.getStringExtra("marks"));
        share=findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "My score in quiz is: " + intent.getStringExtra("marks"));
                sendIntent.setType("text/plain");
                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            }
        });
        home1=findViewById(R.id.HOME);
        home1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(share.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}