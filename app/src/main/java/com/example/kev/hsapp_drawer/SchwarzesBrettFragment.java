package com.example.kev.hsapp_drawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SchwarzesBrettFragment extends Fragment {
    private WebView webView;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_schwarzesbrett, container, false);
        webView = (WebView) v.findViewById(R.id.webview);
        webView.loadUrl("https://f4.hs-hannover.de/studium/schwarzes-brett/index.html?tx_fhhbulletinboard_ui%5Bcategory%5D=3&tx_fhhbulletinboard_ui%5Baction%5D=category&tx_fhhbulletinboard_ui%5Bcontroller%5D=Post&cHash=3057deeb5e1a8c1cbb53705ff5bf25d1");

        // Aktiviert JavaScript

        webView.getSettings().setJavaScriptEnabled(true);

        // Öffnet den Link im webView anstelle vom Browser
        webView.setWebViewClient(new WebViewClient());

        return v;
    }

}
