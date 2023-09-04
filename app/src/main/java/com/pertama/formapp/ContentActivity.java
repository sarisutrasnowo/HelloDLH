package com.pertama.formapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        textView = findViewById(R.id.txtview);
    }

    public void keberita(View view) {
        Intent move=new Intent(this,ContentActivity.class);
        startActivity(move);
    }
}