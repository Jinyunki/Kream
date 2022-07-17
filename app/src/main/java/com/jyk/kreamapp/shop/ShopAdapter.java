package com.jyk.kreamapp.shop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.DataItem;
import com.jyk.kreamapp.R;
import com.jyk.kreamapp.shop.alignment.ShopAlignmentHolder;
import com.jyk.kreamapp.shop.banner.ShopBannersHolder;
import com.jyk.kreamapp.shop.banner.adapter.ShopBannerAdapter;
import com.jyk.kreamapp.shop.brand.ShopBrandsHolder;
import com.jyk.kreamapp.shop.brand.adapter.ShopBrandAdapter;
import com.jyk.kreamapp.shop.category.ShopCategoriseHolder;
import com.jyk.kreamapp.shop.category.adapter.ShopCategoryAdapter;
import com.jyk.kreamapp.shop.product.ShopProductHolder;

import java.util.ArrayList;


public class ShopAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    FragmentManager fragmentManager;
    Lifecycle lifecycle;
    int Count;
    ArrayList<DataItem> mData = new ArrayList<DataItem>();

    public ShopAdapter(Context context, FragmentManager fragmentManager, Lifecycle lifecycle, int count) {
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.lifecycle = lifecycle;
        Count = count;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view;
        if (viewType == DataItem.SHOP_PAGE_BANNER) {
            view = inflater.inflate(R.layout.listitem_shop_banner, parent, false);
            return new ShopBannersHolder(view);

        } else if (viewType == DataItem.SHOP_PAGE_CATEGORY) {
            view = inflater.inflate(R.layout.listitem_shop_categorise, parent, false);
            return new ShopCategoriseHolder(view);

        } else if (viewType == DataItem.SHOP_PAGE_BRAND) {
            view = inflater.inflate(R.layout.listitem_shop_brands, parent, false);
            return new ShopBrandsHolder(view);

        } else if (viewType == DataItem.SHOP_PAGE_ALIGNMENT) {
            view = inflater.inflate(R.layout.listitem_shop_alignment, parent, false);
            return new ShopAlignmentHolder(view);

        } else {
            view = inflater.inflate(R.layout.listitem_shop_product, parent, false);
            return new ShopProductHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);
        if (viewType == DataItem.SHOP_PAGE_BANNER) {
            ShopBannersHolder viewHolder = (ShopBannersHolder) holder;
            viewHolder.viewPager2.setAdapter(new ShopBannerAdapter(fragmentManager, lifecycle, Count));

        } else if (viewType == DataItem.SHOP_PAGE_CATEGORY) {
            ShopCategoriseHolder viewHolder = (ShopCategoriseHolder) holder;
            viewHolder.onBind(context, new ShopCategoryAdapter());

        } else if (viewType == DataItem.SHOP_PAGE_BRAND) {
            ShopBrandsHolder viewHolder = (ShopBrandsHolder) holder;
            viewHolder.onBind(context, new ShopBrandAdapter());

        } else if (viewType == DataItem.SHOP_PAGE_PRODUCT) {
            ShopProductHolder viewHolder = (ShopProductHolder) holder;
            viewHolder.textView.setText("" + position + "번째 브랜드");
        }
    }

    @Override
    public int getItemCount() {
        return 4 + mData.size();
    }

    public void addItem(DataItem item) {
        mData.add(item);
    }

    public void addAll(ArrayList<DataItem> items) {
        mData.clear();
        mData.addAll(items);
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return DataItem.SHOP_PAGE_BANNER;
        } else if (position == 1) {
            return DataItem.SHOP_PAGE_CATEGORY;
        } else if (position == 2) {
            return DataItem.SHOP_PAGE_BRAND;
        } else if (position == 3) {
            return DataItem.SHOP_PAGE_ALIGNMENT;
        } else if (position == 4) {
            return DataItem.SHOP_PAGE_PRODUCT;
        } else {
            return -1;
        }
    }
}