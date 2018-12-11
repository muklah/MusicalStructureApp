package com.example.muklahhn.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button mainActivity = findViewById(R.id.main_activity);
        Button musicList = findViewById(R.id.music_list);
        Button buyMusic = findViewById(R.id.buy_music);

        mainActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });

        musicList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(NowPlayingActivity.this, MusicListActivity.class);
                startActivity(nowPlaying);
            }
        });

        buyMusic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent buyMusic = new Intent(NowPlayingActivity.this, BuyMusicActivity.class);
                startActivity(buyMusic);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
