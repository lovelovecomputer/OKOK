package com.jisuanjixi.wen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by asus1 on 2018/3/8.
 */

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

       /* ActionBar actionBar = getSupportActionBar();        //隐藏自带标题栏
        if(actionBar != null){
            actionBar.hide();
        }*/

        Button button =(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this,First_b.class);
                startActivity(intent);
            }
        });

        Button button1 =(Button) findViewById(R.id.button_a);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(FirstActivity.this,FirstActivity.class);
                startActivity(intent1);
            }
        });

        Button button2 =(Button) findViewById(R.id.button_b);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent2);
            }
        });

        Button button3 =(Button) findViewById(R.id.button_c);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(FirstActivity.this,ThirdActivity.class);
                startActivity(intent3);
            }
        });

    }
}
