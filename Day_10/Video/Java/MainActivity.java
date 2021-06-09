package com.example.callinandroid;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  VideoView video;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      video = findViewById(R.id.video);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(video);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.animal);
        video.setMediaController(mediaController);
        video.setVideoURI(uri);
        video.requestFocus();
        video.start();
        video.setOnCompletionListener(mp -> Toast.makeText(MainActivity.this,"Thank You.....!",Toast.LENGTH_SHORT).show());
        video.setOnErrorListener((mp, what, extra) -> {
            Toast.makeText(MainActivity.this,"Error has occurred (-_-)",Toast.LENGTH_SHORT).show();
            return false;
        });
}

}