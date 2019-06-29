package nlpl.com.gcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView wb = (WebView) findViewById(R.id.webview);
        WebSettings ws = wb.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setBuiltInZoomControls(true);

        wb.loadUrl("file:///android_asset/gco-webview/index.html");
    }
}
