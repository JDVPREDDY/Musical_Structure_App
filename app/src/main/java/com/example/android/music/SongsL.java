package com.example.android.music;

public class SongsL {
    private String mSong_name;
    private String mArtist_name;
    private String mDuration;
    private String mAlbum;

    public SongsL(String song_name, String artist_name, String duration,String album){
        mSong_name = song_name;
        mAlbum =album;
        mArtist_name = artist_name;
        mDuration =duration;
    }

    public String getSongName(){ return mSong_name; }
    public String getSongArtist(){ return mArtist_name;}
    public String getAlbum() {
        return mAlbum;
    }
    public String getDuration() {
        return mDuration;
    }
}
