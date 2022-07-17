package com.jyk.kreamapp.style.hot.profile;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;


public class StyleHotProfileHolder extends RecyclerView.ViewHolder {

    public TextView tv_id;

    public StyleHotProfileHolder(@NonNull View itemView) {
        super(itemView);

        tv_id = itemView.findViewById(R.id.tv_style_page_id);
    }
}
