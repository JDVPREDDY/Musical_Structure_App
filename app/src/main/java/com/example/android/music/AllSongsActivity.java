package com.example.android.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        final ArrayList<SongsL> songs  = new ArrayList<SongsL>();
        songs.add(new SongsL("La Cintura","Alvaro Soler","3:25","Mar de colores"));
        songs.add(new SongsL("Histerico","Alvaro Soler","2:59","Mar de colores"));
        songs.add(new SongsL("Ella","Alvaro Soler","3:33","Mar de colores"));
        songs.add(new SongsL("Veneno","Alvaro Soler","3:15","Mar de colores"));
        songs.add(new SongsL("La Bonita","Alvaro Soler","2:58","Mar de colores"));
        songs.add(new SongsL("Libre ft. Monika Lewzuck","Alvaro Soler","3:00","Agosto"));
        songs.add(new SongsL("Cuando Volveras","Alvaro Soler","3:00","Agosto"));
        songs.add(new SongsL("Mi corazon","Alvaro Soler","3:10","Agosto"));
        songs.add(new SongsL("El Mismo Sol","Alvaro Soler","3:00","Agosto"));
        songs.add(new SongsL("Lucia","Alvaro Soler","3:28","Agosto"));
        songs.add(new SongsL("Agosto","Alvaro Soler","2:58","Agosto"));
        songs.add(new SongsL("Volar","Alvaro Soler","3:01","Agosto"));
        songs.add(new SongsL("Tengo Un Sentimiento","Alvaro Soler","3:04","Agosto"));
        songs.add(new SongsL("Esperandote","Alvaro Soler","3:16","Agosto"));
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
        songs.add(new SongsL("Step Into My World","Jennifer Lopez","4:05","Rebirth"));
        songs.add(new SongsL("Whatever You Wanna Do","Jennifer Lopez","3:49","Rebirth"));
        songs.add(new SongsL("Cherry Pie","Jennifer Lopez","4:06","Rebirth"));
        songs.add(new SongsL("He'll Be Back","Jennifer Lopez","4:18","Rebirth"));
        songs.add(new SongsL("Heartbreaker","Enrique Iglesias","4:05","Euphoria"));
        songs.add(new SongsL("Coming Home","Enrique Iglesias","3:59","Euphoria"));
        songs.add(new SongsL("Everything's Gonna Be Alright","Enrique Iglesias","3:47","Euphoria"));
        songs.add(new SongsL("One Day at a Time","Enrique Iglesias","4:05","Euphoria"));
        songs.add(new SongsL("Why Not Me?","Enrique Iglesias","3:39","Euphoria"));



        SongAdapter adapter = new SongAdapter(this, songs,R.color.genere_bg);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
