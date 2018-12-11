package com.example.muklahhn.musicalstructure;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;

/**
 * Created by Muklah H N on 12/07/2018.
 */

public class MusicAdapter extends ArrayAdapter<MusicItem> {

    ArrayList<MusicItem> musicList = new ArrayList<>();

    public MusicAdapter(Context context, int textViewResourceId, ArrayList<MusicItem> musicListObjects) {
        super(context, textViewResourceId, musicListObjects);
        musicList = musicListObjects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.songs_list, null);
        ImageView songPoster = (ImageView) convertView.findViewById(R.id.song_poster);
        TextView songName = (TextView) convertView.findViewById(R.id.song_name);
        TextView singerName = (TextView) convertView.findViewById(R.id.singer_name);

        songPoster.setImageResource(musicList.get(position).getSongPoster());
        songName.setText(musicList.get(position).getSongName());
        singerName.setText(musicList.get(position).getSingerName());
        return convertView;

    }

}

