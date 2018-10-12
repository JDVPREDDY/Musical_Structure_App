package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        TextView artists = (TextView) findViewById(R.id.alv_id);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noscat = new Intent(ArtistActivity.this,Alvaro.class);
                startActivity(noscat);
            }
        });

        artists = (TextView) findViewById(R.id.malu_id);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noscat = new Intent(ArtistActivity.this,Maluma.class);
                startActivity(noscat);
            }
        });

        artists = (TextView) findViewById(R.id.enri_id);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nos = new Intent(ArtistActivity.this,Enrique.class);
                startActivity(nos);
            }
        });

        artists = (TextView) findViewById(R.id.jlz_id);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nos = new Intent(ArtistActivity.this,Jennifer.class);
                startActivity(nos);
            }
        });
    }
}
