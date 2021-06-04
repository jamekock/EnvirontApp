package com.sh1.environtapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity2 extends AppCompatActivity {

    String text;
    WebView webView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intent = getIntent();
        webView = findViewById(R.id.webView);
        text = intent.getExtras().getString("text");
        webView.loadUrl(text);
    }

    public void prueba(View v) {
        finish();
    }
}