package com.jisuanjixi.wen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by asus1 on 2018/3/9.
 */

public class First_b extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceStates){
        super.onCreate(saveInstanceStates);
        setContentView(R.layout.activity_first_b);
                                                             //点击按钮去Second
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(First_b.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
