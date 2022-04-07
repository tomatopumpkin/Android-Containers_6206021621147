package com.wimonsiri.containers_6206021621147;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new MyWebViewClient ());
        String url = "http://www.google.com";
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request)
        {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}
