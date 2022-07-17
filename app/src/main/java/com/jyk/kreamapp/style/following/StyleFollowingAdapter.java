package com.jyk.kreamapp.style.following;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.DataItem;
import com.jyk.kreamapp.R;
import com.jyk.kreamapp.style.following.product.StyleFollowingProductAdapter;
import com.jyk.kreamapp.style.following.capture.StyleFollowingCaptureAdapter;

import java.util.ArrayList;

public class StyleFollowingAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<DataItem> dataItems = new ArrayList<>();
    FragmentActivity fragmentActivity;
    int count;

    public StyleFollowingAdapter(Context context, FragmentActivity fragmentActivity) {
        this.context = context;
        this.fragmentActivity = fragmentActivity;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.listitem_follwing, parent, false);
        return new StyleFollowingHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        StyleFollowingHolder styleFollowingHolder = (StyleFollowingHolder) holder;
        styleFollowingHolder.vpCapture.setAdapter(new StyleFollowingCaptureAdapter(fragmentActivity, count));
        styleFollowingHolder.onBind(context, new StyleFollowingProductAdapter());
        styleFollowingHolder.textView.setText("순서 : " + position + "번째 히스토리");

    }

    public void addItem(DataItem item) {
        this.dataItems.add(item);
    }

    public void addAll(ArrayList<DataItem> items) {
        this.dataItems.clear();
        this.dataItems.addAll(items);
    }

    @Override
    public int getItemCount() {
        return dataItems.size();
    }

}
