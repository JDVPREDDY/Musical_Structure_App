package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView recents = (TextView) findViewById(R.id.recent);
        recents.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view) {
                Intent nosact = new Intent(MainActivity.this, RecentActivity.class);
                startActivity(nosact);
            }
        });

        TextView artists = (TextView) findViewById(R.id.artist);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noscat = new Intent(MainActivity.this,ArtistActivity.class);
                startActivity(noscat);
            }
        });

        TextView alb = (TextView) findViewById(R.id.album);
        alb.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view) {
                Intent nosact = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(nosact);
            }
        });

        TextView gene = (TextView) findViewById(R.id.all_songs);
        gene.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view) {
                Intent nosact = new Intent(MainActivity.this, AllSongsActivity.class);
                startActivity(nosact);
            }
        });
    }
}
