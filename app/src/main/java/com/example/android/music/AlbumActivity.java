package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        final ArrayList<AlbumL> albums = new ArrayList<AlbumL>();
        albums.add(new AlbumL("Agosto", "Alvaro Soler"));
        albums.add(new AlbumL("Mar De Colores", "Alvaro Soler"));
        albums.add(new AlbumL("PrettyBoy DirtyBoy", "Maluma"));
        albums.add(new AlbumL("Magia", "Maluma"));
        albums.add(new AlbumL("Euphoria", "Enrique Iglesias"));
        albums.add(new AlbumL("Rebirth","Jennifer Lopez"));

        AlbumAdapter adapter = new AlbumAdapter(this, albums,R.color.album_bg);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Intent act = new Intent(AlbumActivity.this, agosto.class);
                    startActivity(act);
                }
                if (position == 1) {
                    Intent act = new Intent(AlbumActivity.this, Mar_de.class);
                    startActivity(act);
                }
                if (position == 2) {
                    Intent act = new Intent(AlbumActivity.this, PrettyBoyDirtyBoy.class);
                    startActivity(act);
                }
                if (position == 3) {
                    Intent act = new Intent(AlbumActivity.this, Magia.class);
                    startActivity(act);
                }
                if (position == 4) {
                    Intent act = new Intent(AlbumActivity.this, Euphoria.class);
                    startActivity(act);
                }
                if (position == 5) {
                    Intent act = new Intent(AlbumActivity.this, Rebirth.class);
                    startActivity(act);
                }
            }
        });

    }
}