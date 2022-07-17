package com.jyk.kreamapp.style.following;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.DataItem;
import com.jyk.kreamapp.R;

public class StyleFollowingFragment extends Fragment {
    RecyclerView recyclerView;
    StyleFollowingAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_hot_and_following,container,false);

        recyclerView = viewGroup.findViewById(R.id.rv_style_hot_vertical);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new StyleFollowingAdapter(getContext(),getActivity());
        adapter.addAll(DataItem.dataItems(10));
        recyclerView.setAdapter(adapter);
        return viewGroup;
    }
}
