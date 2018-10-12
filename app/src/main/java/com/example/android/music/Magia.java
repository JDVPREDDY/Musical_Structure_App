package com.example.android.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Magia extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<SongsL> songs  = new ArrayList<SongsL>();
        songs.add(new SongsL("Intro, Magia","Maluma","2:12","Magia"));
        songs.add(new SongsL("Obsesión","Maluma","3:00","Magia"));
        songs.add(new SongsL("Loco","Maluma","3:10","Magia"));
        songs.add(new SongsL("Malo","Maluma","3:25","Magia"));
        songs.add(new SongsL("Hoy","Maluma","2:33","Magia"));
        songs.add(new SongsL("Tu Mirada","Maluma","3:17","Magia"));


        SongAdapter adapter = new SongAdapter(this, songs,R.color.magia);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
