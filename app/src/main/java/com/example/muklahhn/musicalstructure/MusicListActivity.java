package com.example.muklahhn.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MusicListActivity extends AppCompatActivity {

    private ListView listView;
    private MusicAdapter mAdapter;
    ArrayList<MusicItem> musicList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.list);

        musicList.add(new MusicItem(R.drawable.we_dont_talk_anymore, "We don't talk anymore" , "Charlie Puth"));
        musicList.add(new MusicItem(R.drawable.perfect, "Perfect" , "Ed Shareen"));
        musicList.add(new MusicItem(R.drawable.heaven, "Heaven" , "Shane Filan"));
        musicList.add(new MusicItem(R.drawable.photograph, "Photograph" , "Ed Shareen"));

        mAdapter = new MusicAdapter(this,R.layout.songs_list,musicList);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if (position == 0) {
                    Intent india = new Intent(MusicListActivity.this, NowPlayingActivity.class);
                    startActivity(india);
                }

                if (position == 1 || position == 2 || position == 3 || position == 4 || position == 5
                        || position == 6 || position == 7 ) {
                    Toast.makeText(MusicListActivity.this, "Click on first song only to play it",
                            Toast.LENGTH_LONG).show();
                }

            }
        });

        Button mainActivity = findViewById(R.id.main_activity);
        Button nowPlaying = findViewById(R.id.now_playing);
        Button buyMusic = findViewById(R.id.buy_music);

        mainActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(MusicListActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(MusicListActivity.this, NowPlayingActivity.class);
                startActivity(nowPlaying);
            }
        });

        buyMusic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent buyMusic = new Intent(MusicListActivity.this, BuyMusicActivity.class);
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
