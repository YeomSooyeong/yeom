package com.example.cho.test_12_02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

/**
 * Created by User on 2016-11-15.
 */

public class Test2  extends Fragment {
    public Test2(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.home_to_mgz_wv,container,false);
      WebView webView = (WebView) view.findViewById(R.id.web_view);
       webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://igbtkd.wixsite.com/mysite-2/2016");
        webView.getSettings().setJavaScriptEnabled(true);
        return view;
    }

}