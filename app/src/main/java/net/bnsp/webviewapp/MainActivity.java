package net.bnsp.webviewapp;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private ProgressBar horizontalProgres;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=findViewById(R.id.ini_webview);
        horizontalProgres=findViewById(R.id.ini_progresbar);

        webView.loadUrl("https://github.com/Ayahviramempesonah/myResume");
        WebSettings settings=webView .getSettings();
        settings.setJavaScriptEnabled(true);

        webView.setWebChromeClient(new WebChromeClient(){
           // @Override
            public void onProgresChanged(WebView view,int newProgress){
                horizontalProgres.setProgress(newProgress);
                if (newProgress == 100){
                    horizontalProgres.setVisibility(View.GONE);
                }else {
                    horizontalProgres.setVisibility(View.VISIBLE);
                }
                super.onProgressChanged(view,newProgress);
            }
        });









    }
}