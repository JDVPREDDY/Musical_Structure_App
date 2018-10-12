package com.example.android.music;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Euphoria extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<SongsL> songs  = new ArrayList<SongsL>();
        songs.add(new SongsL("Heartbreaker","Enrique Iglesias","4:05","Euphoria"));
        songs.add(new SongsL("Coming Home","Enrique Iglesias","3:59","Euphoria"));
        songs.add(new SongsL("Everything's Gonna Be Alright","Enrique Iglesias","3:47","Euphoria"));
        songs.add(new SongsL("One Day at a Time","Enrique Iglesias","4:05","Euphoria"));
        songs.add(new SongsL("Why Not Me?","Enrique Iglesias","3:39","Euphoria"));


        SongAdapter adapter = new SongAdapter(this, songs,R.color.uphoria);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
