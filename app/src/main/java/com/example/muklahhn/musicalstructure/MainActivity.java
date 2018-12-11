package com.example.muklahhn.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nowPlaying = findViewById(R.id.now_playing);
        TextView musicList = findViewById(R.id.music_list);
        TextView buyMusic = findViewById(R.id.buy_music);

        nowPlaying.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlaying);
            }
        });

        musicList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent musicList = new Intent(MainActivity.this, MusicListActivity.class);
                startActivity(musicList);
            }
        });

        buyMusic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent buyMusic = new Intent(MainActivity.this, BuyMusicActivity.class);
                startActivity(buyMusic);
            }
        });

    }
}