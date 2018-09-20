package com.example.administrator.firstappapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick1(View v){
        Intent it = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(it);
    }
     public void onclick2(View v){
         Intent it = new Intent(MainActivity.this,Main2Activity.class);
         startActivity(it);
     }

    public void onclick3(View v){
        Intent it = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(it);
    }

    public void onclick4(View v){
        Intent it = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(it);
    }

}
