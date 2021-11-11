package com.example.quiz_kh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class learning extends AppCompatActivity {

    String[] quest={"أ ہ","ع ح","غ خ","ق","ک" ,"ض" ,"ل" ,"ن" ,"ر" ,"ت د ط","ر", "ت د ط", "ظ ذ ث","م ن" ,"ف"};
    String[] ans={"End of Throat","Middle of Throat","Start of the Throat","Base of Tongue which is near Uvula touching the mouth roof","Portion of Tongue near its base touching the root of mouth", "One side of the tongue touching the molar teeth","Rounded tip of the tongue touching the base of the frontal 8 teeth","Rounded tip of the tongue touching the base of the frontal 6 teeth","Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth" ,"Tip of the tongue touching the base of the front 2 teeth","Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth", "Tip of the tongue touching the base of the front 2 teeth","Tip of the tongue touching the tip of the frontal 2 teeth","While pronouncing the ending sound of م or ن , bring the vibration to the nose" ,"Tip of the two upper jaw teeth touches the inner part of the lower lip"};
    TextView t1,t2;
    Button next;

    int score=0 , i=0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        generate_Ans();

        next=findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(i<14){
                    i++;
                }else if (i==14)
                {
                    Intent intent = new Intent(learning.this, MainActivity.class);
                    startActivity(intent);
                }
                generate_Ans();

            }
        });
    }


    public void generate_Ans()
    {
        if(i<15) {
            t1 = findViewById(R.id.ans);
            t2=findViewById((R.id.question));
            t1.setText(quest[i]);
            t2.setText(ans[i]);
        }
    }
}
