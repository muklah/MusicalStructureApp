package com.example.muklahhn.musicalstructure;

/**
 * Created by Muklah H N on 12/07/2018.
 */

public class MusicItem {

    int songPoster;
    String songName;
    String singerName;

    public MusicItem(int songPoster, String songName, String singerName)
    {
        this.songPoster = songPoster;
        this.songName = songName;
        this.singerName = singerName;
    }

    public int getSongPoster()
    {
        return songPoster;
    }

    public String getSongName()
    {
        return songName;
    }

    public String getSingerName()
    {
        return singerName;
    }
}