package com.pertama.formapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonlogin=findViewById(R.id.btnlogin);
    }

    public void login(View view) {
        Intent pindah=new Intent(this,ContentActivity.class);
        startActivity(pindah);
    }
}