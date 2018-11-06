package com.example.kev.hsapp_drawer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MensaFragment extends Fragment {
    private WebView webView;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_mensa, container, false);
        webView = (WebView) v.findViewById(R.id.webview);
        webView.loadUrl("https://www.studentenwerk-hannover.de/essen/speiseplaene/rs/");

        // Aktiviert JavaScript

        webView.getSettings().setJavaScriptEnabled(true);

        // Öffnet den Link im webView anstelle vom Browser
        webView.setWebViewClient(new WebViewClient());

        return v;
    }

}
