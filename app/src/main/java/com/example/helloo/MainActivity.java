package com.example.helloo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static int Max(int a,int b){
        return(Math.max(a,b));
    }
    public static int Min(int a,int b){
        return(Math.min(a,b));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}