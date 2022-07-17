package com.jyk.kreamapp.home.today;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.home.today.category.adapter.HomeCategoryAdapter;
import com.jyk.kreamapp.home.today.category.HomeCategoriseHolder;
import com.jyk.kreamapp.home.today.product.HomeProductsHolder;
import com.jyk.kreamapp.home.today.product.adapter.HomeProductAdapter;
import com.jyk.kreamapp.home.today.style.HomeStylesHolder;
import com.jyk.kreamapp.home.today.style.adapter.HomeStyleAdapter;
import com.jyk.kreamapp.home.today.banner.HomeBannersHolder;
import com.jyk.kreamapp.home.today.banner.adapter.HomeBannerPagerAdapter;
import com.jyk.kreamapp.ItemAndUtils.DataItem;
import com.jyk.kreamapp.R;

import java.util.ArrayList;

public class HomeTodayAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    // 생성자 파라미터에 필요
    Context context;
    ArrayList<DataItem> dataItems = new ArrayList<>();
    FragmentManager fragmentManager;
    Lifecycle lifecycle;
    int count;
    // 외부 호출용 생성자
    public HomeTodayAdapter(Context context, FragmentManager fragmentManager, Lifecycle lifecycle, int count) {
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.lifecycle = lifecycle;
        this.count = count;
    }

    @NonNull
    @Override
    // 리사이클러뷰에 들어갈 첫번쨰 페이지를 호출 (first_recyclerview_item)
    // 뷰홀더 생성 > 호출한 페이지안에 있는 (뷰페이저) 를 호출
    // 메모리에 영역을 확보
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view;

        if (viewType ==DataItem.HOME_TODAY_BANNER) {
            view = layoutInflater.inflate(R.layout.listitem_home_banner,parent,false);
            return new HomeBannersHolder(view);
        } else if (viewType == DataItem.HOME_TODAY_CATEGORY){
            view = layoutInflater.inflate(R.layout.listitem_home_catagorise,parent,false);
            return new HomeCategoriseHolder(view);
        } else if (viewType == DataItem.HOME_TODAY_PRODUCT){
            view = layoutInflater.inflate(R.layout.listitem_home_products,parent,false);
            return new HomeProductsHolder(view);
        } else {
            view = layoutInflater.inflate(R.layout.listitem_home_styles,parent,false);
            return new HomeStylesHolder(view);
        }
    }

    @Override
    // 뷰홀더와 , 리사이클러뷰 내부에 들어갈 뷰페이저 FragStateAdapter를 연결
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);

        if (viewType == DataItem.HOME_TODAY_BANNER){
            HomeBannersHolder viewHolder = (HomeBannersHolder) holder;
            viewHolder.viewPager2.setAdapter(new HomeBannerPagerAdapter(fragmentManager,lifecycle,count));

        } else if (viewType == DataItem.HOME_TODAY_CATEGORY){
            HomeCategoriseHolder viewHolder = (HomeCategoriseHolder) holder;
            viewHolder.onBind(context, new HomeCategoryAdapter(),5);

        } else if (viewType == DataItem.HOME_TODAY_PRODUCT){
            HomeProductsHolder viewHolder = (HomeProductsHolder) holder;
            viewHolder.onBind(context, new HomeProductAdapter());
        } else {
            HomeStylesHolder viewHolder = (HomeStylesHolder) holder;
            viewHolder.onBind(context, new HomeStyleAdapter());
        }
    }

    // 데이터를 하나씩 주입
    public void addItem(DataItem item){
        this.dataItems.add(item);
    }

    // 데이터를 한번에 모두 주입
    public void addAll(ArrayList<DataItem> items){
        this.dataItems.clear();
        this.dataItems.addAll(items);
    }

    @Override
    // 리사이클러뷰의 갯수를 지정함
    // 현재는 어레이리스트 데이터의 크기만큼 반환
    public int getItemCount() {
        return 4;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return DataItem.HOME_TODAY_BANNER;
        } else if (position == 1) {
            return DataItem.HOME_TODAY_CATEGORY;
        } else if (position == 2){
            return DataItem.HOME_TODAY_PRODUCT;
        } else if (position == 3){
            return DataItem.HOME_TODAY_STYLE;
        }
            return -1;
    }
}
