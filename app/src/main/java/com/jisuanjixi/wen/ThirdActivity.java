package com.jisuanjixi.wen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by asus1 on 2018/3/9.
 */

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceStates) {
        super.onCreate(saveInstanceStates);
        setContentView(R.layout.activity_third);

        Button button1 =(Button) findViewById(R.id.button_a);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ThirdActivity.this,FirstActivity.class);
                startActivity(intent1);
            }
        });

        Button button2 =(Button) findViewById(R.id.button_b);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ThirdActivity.this,SecondActivity.class);
                startActivity(intent2);
            }
        });

        Button button3 =(Button) findViewById(R.id.button_c);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(ThirdActivity.this,ThirdActivity.class);
                startActivity(intent3);
            }
        });
    }
}
