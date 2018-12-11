package com.example.muklahhn.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Muklah H N on 10/07/2018.
 */

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final Integer[] song_poster;
    private final String[] songName;
    private final String[] singerName;

    public CustomListAdapter(Activity context, Integer[] song_poster, String[] songName, String[] singerName) {
        super(context, R.layout.songs_list, songName);

        this.context=context;
        this.song_poster=song_poster;
        this.songName=songName;
        this.singerName=singerName;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.songs_list, null,true);

        ImageView ivSongPoster = (ImageView) rowView.findViewById(R.id.song_poster);
        TextView tvSongName = (TextView) rowView.findViewById(R.id.song_name);
        TextView tvSingerName = (TextView) rowView.findViewById(R.id.singer_name);

        ivSongPoster.setImageResource(song_poster[position]);
        tvSongName.setText(songName[position]);
        tvSingerName.setText("By "+singerName[position]);
        return rowView;

    };
}