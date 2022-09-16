package com.example.fragments;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClick1(View view)
    {
        Fragment1 f1 = new Fragment1();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.Container, f1);
        ft.commit();
    }
    public void OnClick2(View view)
    {
        Fragment2 f2 = new Fragment2();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.Container, f2);
        ft.commit();
    }
    public void OnClick3(View view)
    {
        Fragment3 f3 = new Fragment3();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.Container, f3);
        ft.commit();
    }
}