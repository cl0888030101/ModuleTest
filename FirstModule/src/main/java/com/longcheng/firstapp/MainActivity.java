package com.longcheng.firstapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("hello world");
        System.out.println("hello world two");
        Intent i = new Intent(MainActivity.this, com.longcheng.secondapp.MainActivity.class);
        startActivity(i);
    }
}