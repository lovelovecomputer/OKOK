package com.jisuanjixi.wen;

import android.content.Intent;
import android.os.Bundle;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by asus1 on 2018/3/9.
 */

public class Second_b extends AppCompatActivity implements View.OnClickListener  {
    @Override
    protected void onCreate(Bundle saveInstanceStates) {
        super.onCreate(saveInstanceStates);
        setContentView(R.layout.activity_second_b);

        Button button =(Button) findViewById(R.id.button);
        button.setOnClickListener(this);}
        public void onClick(View v) {
               switch (v.getId()){
                   case R.id.button:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(Second_b.this);
                        dialog.setTitle("提示：");
                        dialog.setMessage("确认选房？");
                        dialog.setPositiveButton("确认", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {

                        }
                      });
                        dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {

                        }
                      });
                        dialog.show();
                        break;
                    default:
                        break;

            }
        }
}


