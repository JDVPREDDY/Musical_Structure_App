package com.example.android.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RecentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<SongsL> songs  = new ArrayList<SongsL>();
        songs.add(new SongsL("Mismo Sol","Alvaro Soler","3:00","Agosto"));
        songs.add(new SongsL("Sofia","Alvaro Soler","3:00","Agosto"));
        songs.add(new SongsL("Agosto","Alvaro Soler","3:00","Agosto"));
        songs.add(new SongsL("Volar","Alvaro Soler","3:00","Agosto"));
        songs.add(new SongsL("Tengo Sentimento","Alvaro Soler","3:00","Agosto"));
        songs.add(new SongsL("La Cintura","Alvaro Soler","3:00","Mar de colores"));
        songs.add(new SongsL("Libre ft. Monika Lewzuck","Alvaro Soler","3:00","Agosto"));
        songs.add(new SongsL("Cuando Volveras","Alvaro Soler","3:00","Agosto"));
        songs.add(new SongsL("Animal","Alvaro Soler","3:00","Agosto"));
        songs.add(new SongsL("El Perdedor","Maluma","3:27","PrettyBoy DirtyBoy"));
        SongAdapter adapter = new SongAdapter(this, songs,R.color.recent_bg);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
