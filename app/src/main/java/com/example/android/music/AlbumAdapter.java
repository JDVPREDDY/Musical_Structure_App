package com.example.android.music;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<AlbumL> {
private int mColorId;

    public AlbumAdapter(Context context, ArrayList<AlbumL> albums,int colorId) {
        super(context, 0, albums);
        mColorId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_album , parent, false);
        }

        AlbumL currentWord = getItem(position);

        TextView artistName = (TextView) listItemView.findViewById(R.id.artist_name);
        artistName.setText(currentWord.getSongArtist());

        TextView albN =(TextView)listItemView.findViewById(R.id.albums);
        albN.setText(currentWord.getAlbum());
        View textContainer = listItemView.findViewById(R.id.ll);
        int color = ContextCompat.getColor(getContext(), mColorId);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}