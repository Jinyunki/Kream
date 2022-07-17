package com.jyk.kreamapp.watch.youtube;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;

public class WatchYoutubeHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public WatchYoutubeHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.tv_youtube_name);
    }
}
