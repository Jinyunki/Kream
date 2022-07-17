package com.jyk.kreamapp.style.following.capture;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.jyk.kreamapp.R;

public class StyleFollowingCaptureFragment extends Fragment {
    TextView tvCount;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.fragment_style_following,container,false);

        tvCount = view.findViewById(R.id.tv_page_count);

        return view;
    }
}
