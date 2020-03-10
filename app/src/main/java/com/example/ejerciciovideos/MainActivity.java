package com.example.ejerciciovideos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    VideoView vv;
    Button btnV1,btnV2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        vv=(VideoView)findViewById(R.id.videoView);
        btnV1=(Button)findViewById(R.id.button);
        btnV2=(Button)findViewById(R.id.button2);

        btnV1.setOnClickListener(this);
        btnV2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                String loc="android.resource://"+getPackageName()+"/"+R.raw.rode;
                vv.setVideoURI(Uri.parse(loc));
                vv.setMediaController(new MediaController(this));//muestra los botones del video controlador de medios
                vv.start();
                vv.requestFocus();
                break;
            case R.id.button2:
                String loc2="android.resource://"+getPackageName()+"/"+R.raw.universo;
                vv.setVideoURI(Uri.parse(loc2));
                vv.setMediaController(new MediaController(this));//muestra los botones del video controlador de medios
                vv.start();
                vv.requestFocus();
                break;
        }
    }
}
