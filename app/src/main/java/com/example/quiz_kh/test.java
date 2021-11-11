package com.example.quiz_kh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class test extends AppCompatActivity {
    String[] quest={"أ ہ","ع ح","غ خ","ق","ک" ,"ض" ,"ل" ,"ن" ,"ر" ,"ت د ط","ن"};
    String[] key={"End of Throat","Middle of Throat","Start of the Throat","Base of Tongue which is near Uvula touching the mouth roof","Portion of Tongue near its base touching the roof of mouth", "One side of the tongue touching the molar teeth","Rounded tip of the tongue touching the base of the frontal 8 teeth","Rounded tip of the tongue touching the base of the frontal 6 teeth","Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth" ,"Tip of the tongue touching the base of the front 2 teeth"};
    TextView t1,test_score;
    Button b1,b2,b3,b4;
    int marks=0 , i=0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        generate_question();
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i<9 && b1.getText().toString().equals(key[i])) {
                    marks++;


                }else if (i==9)
                {
                    Intent intent = new Intent(test.this, share.class);
                    intent.putExtra("marks", "YOUR MARKS ARE :"+marks);
                    startActivity(intent);

                }
                i++;
                generate_question();
            }
        });
        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i<9 && b2.getText().toString().equals(key[i])) {
                    marks++;

                }else if (i==9)
                {

                    Intent intent = new Intent(test.this, share.class);
                    intent.putExtra("marks", "YOUR MARKS ARE :"+marks);
                    startActivity(intent);

                }
                i++;
                generate_question();

            }
        });
        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i<9 && b3.getText().toString().equals(key[i])) {
                    marks++;


                }else if (i==9)
                {
                    Intent intent = new Intent(test.this, share.class);
                    intent.putExtra("marks", "YOUR MARKS ARE :"+marks);
                    startActivity(intent);

                }
                i++;
                generate_question();

            }
        });


        b4 = findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (i<9 && b1.getText().toString()!=key[i] && b2.getText().toString()!=key[i] && b3.getText().toString()!=key[i]) {
                    marks++;

                }else if (i==9)
                {
                    Intent intent = new Intent(test.this, share.class);
                    intent.putExtra("marks", "YOUR MARKS ARE :"+marks);
                    startActivity(intent);
                }
                i++;
                generate_question();
            }
        });
    }
    @Override

    protected void onStart() {

        super.onStart();

        Log.d("TAG", "onStart Activity Main");

    }

    @Override

    protected void onResume() {

        super. onResume();

        Log.d("TAG", " onResume Activity Main");

    }

    @Override

    protected void onPause() {

        super. onPause();

        Log.d("TAG", " onPause Activity Main");

    }

    @Override

    protected void onStop() {

        super. onStop();

        Log.d("TAG", " onStop Activity Main");

    }

    @Override

    protected void onDestroy() {

        super. onDestroy();

        Log.d("TAG", " onDestroy Activity Main");

    }


    public void generate_question()
    {
        if(i<10) {
            t1 = findViewById(R.id.quest);
            b1 = findViewById(R.id.b1);
            b2 = findViewById(R.id.b2);
            b3 = findViewById(R.id.b3);
            b4 = findViewById(R.id.b4);
            b4.setText("None of above");
            int keyL = key.length;
            Random r = new Random();
            int i1 = r.nextInt(keyL - 0) + 0;
            t1.setText(quest[i]);
            b1.setText(key[i1]);
            i1 = r.nextInt(keyL - 0) + 0;
            b2.setText(key[i1]);
            i1 = r.nextInt(keyL - 0) + 0;
            b3.setText(key[i1]);
        }
    }

}

