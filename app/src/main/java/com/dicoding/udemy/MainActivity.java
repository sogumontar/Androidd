package com.dicoding.udemy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void test(View view){
        ImageView gbr1= (ImageView) findViewById(R.id.gbr1);
        ImageView gbr2= (ImageView) findViewById(R.id.gbr2);
//        gbr1.animate().alpha(0f).setDuration(2000);
        gbr1.animate()
                .translationXBy(1000)
                .translationXBy(1000)
                .rotationBy(3600)
                .setDuration(2000);
//        gbr1.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
//        gbr2.animate().alpha(1f).setDuration(1000);

    }
    public void test2(View view){
        ImageView gbr1=(ImageView) findViewById(R.id.gbr1);
        ImageView gbr2=(ImageView) findViewById(R.id.gbr2);
        gbr1.animate().alpha(1f).setDuration(2000);
        gbr2.animate().alpha(0f).setDuration(1000);
    }
}
