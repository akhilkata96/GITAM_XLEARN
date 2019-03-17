package com.gitam.xlearn.gitamxlearn;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Manoj on 6/12/2016.
 */
public class MyAppWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view,String url){
        if(Uri.parse(url).getHost().endsWith("xlearn.gitam.edu/moodle/login/index.php")){
            return false;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;

    }
}
