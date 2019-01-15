package com.jnonealbayparkgames.rovermissionsgpl3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    WebView roverControls;
    WebView roverViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roverControls = (WebView) findViewById(R.id.RoverControls);
        roverViewer = (WebView) findViewById(R.id.RoverViewer);

        WebSettings roverControlsSettings = roverControls.getSettings();
        roverControlsSettings.setJavaScriptEnabled(true);
        roverControlsSettings.setDomStorageEnabled(true);
        roverControlsSettings.setLoadWithOverviewMode(true);
        roverControlsSettings.setUseWideViewPort(true);
        roverControlsSettings.setBuiltInZoomControls(true);
        roverControlsSettings.setDisplayZoomControls(false);
        roverControlsSettings.setSupportZoom(true);
        roverControlsSettings.setDefaultTextEncodingName("utf-8");


        WebSettings roverViewerSettings = roverViewer.getSettings();
        roverViewerSettings.setJavaScriptEnabled(true);
        roverViewerSettings.setDomStorageEnabled(true);
        roverViewerSettings.setLoadWithOverviewMode(true);
        roverViewerSettings.setUseWideViewPort(true);
        roverViewerSettings.setBuiltInZoomControls(true);
        roverViewerSettings.setDisplayZoomControls(false);
        roverViewerSettings.setSupportZoom(true);
        roverViewerSettings.setDefaultTextEncodingName("utf-8");


        roverViewer = (WebView) findViewById(R.id.RoverViewer);
        roverViewer.setWebViewClient(new WebViewClient());
        roverViewer.loadUrl("http://www.jeremiahonealts.com/RoverMissionsGPL3-android-screen.php");

        roverControls = (WebView) findViewById(R.id.RoverControls);
        roverControls.setWebViewClient(new WebViewClient());
        roverControls.loadUrl("http://www.jeremiahonealts.com/RoverMissionsGPL3-android-controls.php");

        TextView aboutText = (TextView) findViewById(R.id.aboutText);
        aboutText.setText("Source code: https://github.com/we6jbo/Rover-Missions-GPL3-android\n" +
                "Rover Missions GPL3 - This is the client side of the Rover Missions interface. The interface that allows the user to move the rover around and to perform missions.\n" +
                "    Copyright (C) 2019  Jeremiah O'Neal and Natalie O'Neal\n" +
                "    This program is free software: you can redistribute it and/or modify\n" +
                "    it under the terms of the GNU General Public License as published by\n" +
                "    the Free Software Foundation, either version 3 of the License, or\n" +
                "    (at your option) any later version.\n" +
                "    This program is distributed in the hope that it will be useful,\n" +
                "    but WITHOUT ANY WARRANTY; without even the implied warranty of\n" +
                "    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\n" +
                "    GNU General Public License for more details.\n" +
                "    You should have received a copy of the GNU General Public License\n" +
                "    along with this program.  If not, see <https://www.gnu.org/licenses/>.");

    }
    public void startEverything(View view)
    {
        roverViewer.loadUrl("http://www.jeremiahonealts.com/RoverMissionsGPL3-android-screen.php");
        roverControls.loadUrl("http://www.jeremiahonealts.com/RoverMissionsGPL3-android-controls.php");

    }
}
