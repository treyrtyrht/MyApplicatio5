package com.example.web;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wv_browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Uri uri=getIntent().getData();
        Log.e("getIntent",getIntent()+"");
        wv_browser=(WebView)findViewById(R.id.wv_browser);
        wv_browser.setWebViewClient(new WebViewClient());
        if(uri!=null){
            wv_browser.loadUrl(uri.toString());
        }
    }

}
