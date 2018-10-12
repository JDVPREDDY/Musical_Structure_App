package com.example.android.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PrettyBoyDirtyBoy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<SongsL> songs  = new ArrayList<SongsL>();
        songs.add(new SongsL("El Perdedor","Maluma","3:27","PrettyBoy DirtyBoy"));
        songs.add(new SongsL("Me Gustas","Maluma","3:37","PrettyBoy DirtyBoy"));
        songs.add(new SongsL("Recuérdame","Maluma","3:10","PrettyBoy DirtyBoy"));
        songs.add(new SongsL("La Misma Moneda","Maluma","3:41","PrettyBoy DirtyBoy"));
        songs.add(new SongsL("Vuelo Hacia el Olvido","Maluma","3:33","PrettyBoy DirtyBoy"));


        SongAdapter adapter = new SongAdapter(this, songs,R.color.pretty);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
