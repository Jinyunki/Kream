package com.jyk.kreamapp.my.profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.DataItem;
import com.jyk.kreamapp.R;
import com.jyk.kreamapp.my.profile.holders.MyProfileCaptureHolder;
import com.jyk.kreamapp.my.profile.holders.MyProfileGradeHolder;

import java.util.ArrayList;

public class MyProfileAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<DataItem> items = new ArrayList<DataItem>();

    public MyProfileAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view;
        if (viewType == DataItem.PROFILE_PAGE_GRADE){
            view = inflater.inflate(R.layout.listitem_profile_grade, parent, false);
            return new MyProfileGradeHolder(view);
        } else {
            view = inflater.inflate(R.layout.listitem_profile_capture,parent,false);
            return new MyProfileCaptureHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    public void addItem(DataItem item) {
        this.items.add(item);
    }

    public void addAll(ArrayList<DataItem> items) {
        this.items.clear();
        this.items.addAll(items);
    }

    @Override
    public int getItemCount() {
        return 1 + items.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return DataItem.PROFILE_PAGE_GRADE; // 게시물
        } else if (position == 1) {
            return DataItem.PROFILE_PAGE_CAPTURE; // 사진
        } else {
            return -1;
        }
    }
}
