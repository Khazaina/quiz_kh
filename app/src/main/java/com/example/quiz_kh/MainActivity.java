package com.example.quiz_kh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); Button button = findViewById(R.id.repo);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url="https://github.com/Khazaina/quiz_kh";
                Uri repository = Uri.parse(url);
                Intent intent = new
                        Intent(Intent.ACTION_VIEW, repository);
                startActivity(intent);
            }
        });
        Button learn =findViewById(R.id.learning);
        learn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, learning.class);
                startActivity(intent);
            }
        });
        Button quiz =findViewById(R.id.test);
        quiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, test.class);
                startActivity(intent);
            }
        });








    }

}