package com.example.android.music;

public class AlbumL {
    private String mAlbum;
    private String mArtist_name;

    public AlbumL(String album, String artist){
        mAlbum =album;
        mArtist_name = artist;
    }

    public String getSongArtist(){ return mArtist_name;}
    public String getAlbum() {
        return mAlbum;
    }
}
