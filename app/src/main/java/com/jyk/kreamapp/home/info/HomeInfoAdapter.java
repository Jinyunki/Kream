package com.jyk.kreamapp.home.info;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.home.info.banner.HomeInfoBannersHolder;
import com.jyk.kreamapp.home.info.product.HomeInfoProductsHolder;
import com.jyk.kreamapp.home.info.category.HomeInfoCategoriseHolder;
import com.jyk.kreamapp.home.info.category.adapter.HomeInfoCategoryAdapter;
import com.jyk.kreamapp.ItemAndUtils.DataItem;
import com.jyk.kreamapp.R;

import java.util.ArrayList;

public class HomeInfoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    // 생성자 파라미터에 필요
    Context context;
    ArrayList<DataItem> dataItems = new ArrayList<>();

    public HomeInfoAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view;

        if (viewType == DataItem.HOME_INFO_BANNER) {
            view = layoutInflater.inflate(R.layout.listitem_info_banner, parent, false);
            return new HomeInfoBannersHolder(view);

        } else if (viewType == DataItem.HOME_INFO_CATEGORY) {
            view = layoutInflater.inflate(R.layout.listitem_info_category, parent, false);
            return new HomeInfoCategoriseHolder(view);

        } else {
            view = layoutInflater.inflate(R.layout.listitem_info_product, parent, false);
            return new HomeInfoProductsHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == DataItem.HOME_INFO_BANNER){
            HomeInfoBannersHolder homeInfoBannersHolder = (HomeInfoBannersHolder) holder;
        } else if (getItemViewType(position) == DataItem.HOME_INFO_CATEGORY){
            HomeInfoCategoriseHolder homeInfoCategoriseHolder = (HomeInfoCategoriseHolder) holder;
            homeInfoCategoriseHolder.onBind(context, new HomeInfoCategoryAdapter());
        } else {
            HomeInfoProductsHolder homeInfoProductsHolder = (HomeInfoProductsHolder) holder;
            homeInfoProductsHolder.tvName.setText(""+position);
        }
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
        return 2 + dataItems.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return DataItem.HOME_INFO_BANNER;
        } else if (position == 1) {
            return DataItem.HOME_INFO_CATEGORY;
        } else if (position == 2) {
            return DataItem.HOME_INFO_PRODUCT;
        } else {
            return -1;
        }
    }
}
