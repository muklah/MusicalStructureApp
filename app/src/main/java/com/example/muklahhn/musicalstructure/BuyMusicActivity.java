package com.example.muklahhn.musicalstructure;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BuyMusicActivity extends AppCompatActivity {

    Button buyMusic;
    EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_music);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buyMusic = (Button) findViewById(R.id.search);
        searchText = (EditText) findViewById(R.id.search_text);

        Button mainActivity = findViewById(R.id.main_activity);
        Button nowPlaying = findViewById(R.id.now_playing);
        Button musicList = findViewById(R.id.music_list);

        mainActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(BuyMusicActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(BuyMusicActivity.this, NowPlayingActivity.class);
                startActivity(nowPlaying);
            }
        });

        musicList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(BuyMusicActivity.this, MusicListActivity.class);
                startActivity(nowPlaying);
            }
        });

    }

    public void searchMusic(View view) {
        String search = searchText.getText().toString();
        Uri uri = Uri.parse("https://play.google.com/store/search?q=" + search + "&c=music");
        Intent playStore = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(playStore);
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
