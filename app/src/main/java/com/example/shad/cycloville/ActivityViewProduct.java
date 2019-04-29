package com.example.shad.cycloville;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityViewProduct extends AppCompatActivity {
    WebView cyclovilleweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);

        cyclovilleweb = findViewById(R.id.cyclovilleWeb);
        cyclovilleweb.loadUrl("https://www.cycloville.co.ke/");
        cyclovilleweb.getSettings().setJavaScriptEnabled(true);

    }
}
