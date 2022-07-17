package com.jyk.kreamapp.home.today.style.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.R;

public class HomeStyleHolder extends RecyclerView.ViewHolder {
    public ImageView ivCapture;
    public ImageView ivProfile;
    public TextView tvSnsId;

    public HomeStyleHolder(@NonNull View itemView) {
        super(itemView);
        ivCapture = itemView.findViewById(R.id.iv_capture);
        ivProfile = itemView.findViewById(R.id.iv_profile);
        tvSnsId = itemView.findViewById(R.id.tv_sns_id);
    }
}
