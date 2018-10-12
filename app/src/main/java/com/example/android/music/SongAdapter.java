package com.example.android.music;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<SongsL>  {

    private int mColorId;
    public SongAdapter(Context context, ArrayList<SongsL> songs,int colorId) {
        super(context, 0, songs);
        mColorId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                   R.layout.list_item_songs , parent, false);
        }

        SongsL currentWord = getItem(position);

        TextView songNameText = (TextView) listItemView.findViewById(R.id.song_name);
        songNameText.setText(currentWord.getSongName());

        TextView artistName = (TextView) listItemView.findViewById(R.id.artist_name);
        artistName.setText(currentWord.getSongArtist());

        TextView dura =(TextView) listItemView.findViewById(R.id.duration);
        dura.setText(currentWord.getDuration());

        TextView albN =(TextView)listItemView.findViewById(R.id.albums);
        albN.setText(currentWord.getAlbum());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}