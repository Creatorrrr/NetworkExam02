package com.example.kosta.networkexam02;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        WebView view = (WebView)findViewById(R.id.webView);
        view.setWebViewClient(new WebViewClient());
        WebSettings settings = view.getSettings();
        settings.setJavaScriptEnabled(true);

        view.loadUrl("http://192.168.0.19:8080/MusicPlaySpring/list");

//        텍스트로 출력
//        final EditText result = (EditText)findViewById(R.id.result);
//
//        findViewById(R.id.get).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                StringBuffer data = new StringBuffer();
//
//                try {
//                    URL getData = new URL("http://192.168.0.19:8080/MusicPlaySpring/list");
//                    BufferedReader bin = new BufferedReader(new InputStreamReader(getData.openStream()));
//                    String str = null;
//                    while((str = bin.readLine()) != null) {
//                        data.append(str);
//                    }
//
//                    result.setText(data.toString());
//
//                    bin.close();
//
//                } catch (MalformedURLException e) {
//                    e.printStackTrace();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
    }
}
