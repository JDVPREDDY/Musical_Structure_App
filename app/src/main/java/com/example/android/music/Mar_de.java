package com.example.android.music;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Mar_de extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<SongsL> songs  = new ArrayList<SongsL>();
        songs.add(new SongsL("La Cintura","Alvaro Soler","3:25","Mar de colores"));
        songs.add(new SongsL("Histerico","Alvaro Soler","2:59","Mar de colores"));
        songs.add(new SongsL("Ella","Alvaro Soler","3:33","Mar de colores"));
        songs.add(new SongsL("Veneno","Alvaro Soler","3:15","Mar de colores"));
        songs.add(new SongsL("La Bonita","Alvaro Soler","2:58","Mar de colores"));

        SongAdapter adapter = new SongAdapter(this, songs,R.color.Marde);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
