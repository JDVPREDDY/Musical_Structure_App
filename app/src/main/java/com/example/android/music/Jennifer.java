package com.example.android.music;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Jennifer extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        final ArrayList<SongsL> songs  = new ArrayList<SongsL>();

        songs.add(new SongsL("Step Into My World","Jennifer Lopez","4:05","Rebirth"));
        songs.add(new SongsL("Whatever You Wanna Do","Jennifer Lopez","3:49","Rebirth"));
        songs.add(new SongsL("Cherry Pie","Jennifer Lopez","4:06","Rebirth"));
        songs.add(new SongsL("He'll Be Back","Jennifer Lopez","4:18","Rebirth"));

        SongAdapter adapter = new SongAdapter(this, songs,R.color.jlz);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
