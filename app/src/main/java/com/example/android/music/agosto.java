package com.example.android.music;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class agosto extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<SongsL> songs  = new ArrayList<SongsL>();
        songs.add(new SongsL("Libre ft. Monika Lewzuck","Alvaro Soler","3:00","Agosto"));
        songs.add(new SongsL("Cuando Volveras","Alvaro Soler","3:00","Agosto"));
        songs.add(new SongsL("Mi corazon","Alvaro Soler","3:10","Agosto"));
        songs.add(new SongsL("El Mismo Sol","Alvaro Soler","3:00","Agosto"));
        songs.add(new SongsL("Lucia","Alvaro Soler","3:28","Agosto"));
        songs.add(new SongsL("Agosto","Alvaro Soler","2:58","Agosto"));
        songs.add(new SongsL("Volar","Alvaro Soler","3:01","Agosto"));
        songs.add(new SongsL("Tengo Un Sentimiento","Alvaro Soler","3:04","Agosto"));
        songs.add(new SongsL("Esperandote","Alvaro Soler","3:16","Agosto"));


        SongAdapter adapter = new SongAdapter(this, songs,R.color.agosto);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
