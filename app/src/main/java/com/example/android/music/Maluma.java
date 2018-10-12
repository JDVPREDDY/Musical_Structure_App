package com.example.android.music;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Maluma extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<SongsL> songs  = new ArrayList<SongsL>();
        songs.add(new SongsL("El Perdedor","Maluma","3:27","PrettyBoy DirtyBoy"));
        songs.add(new SongsL("Me Gustas","Maluma","3:37","PrettyBoy DirtyBoy"));
        songs.add(new SongsL("Recuérdame","Maluma","3:10","PrettyBoy DirtyBoy"));
        songs.add(new SongsL("La Misma Moneda","Maluma","3:41","PrettyBoy DirtyBoy"));
        songs.add(new SongsL("Vuelo Hacia el Olvido","Maluma","3:33","PrettyBoy DirtyBoy"));

        songs.add(new SongsL("Intro, Magia","Maluma","2:12","Magia"));
        songs.add(new SongsL("Obsesión","Maluma","3:00","Magia"));
        songs.add(new SongsL("Loco","Maluma","3:10","Magia"));
        songs.add(new SongsL("Malo","Maluma","3:25","Magia"));
        songs.add(new SongsL("Hoy","Maluma","2:33","Magia"));
        songs.add(new SongsL("Tu Mirada","Maluma","3:17","Magia"));

        SongAdapter adapter = new SongAdapter(this, songs,R.color.maluma);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
