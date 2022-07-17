package com.jyk.kreamapp.my.shopping;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyk.kreamapp.ItemAndUtils.DataItem;
import com.jyk.kreamapp.R;
import com.jyk.kreamapp.my.shopping.holders.MyShoppingBreakdownHolder;
import com.jyk.kreamapp.my.shopping.holders.MyShoppingCallHolder;
import com.jyk.kreamapp.my.shopping.holders.MyShoppingEvaluationHolder;
import com.jyk.kreamapp.my.shopping.holders.MyShoppingGradeHolder;
import com.jyk.kreamapp.my.shopping.holders.MyShoppingHistoryHolder;
import com.jyk.kreamapp.my.shopping.holders.MyShoppingInquiryHolder;
import com.jyk.kreamapp.my.shopping.holders.MyShoppingNoticeHolder;
import com.jyk.kreamapp.my.shopping.holders.MyShoppingStoreHolder;
import com.jyk.kreamapp.my.shopping.holders.MyShoppingTotalEvaluationHolder;

import java.util.ArrayList;

public class MyShoppingAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<DataItem> items = new ArrayList<DataItem>();

    public MyShoppingAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view;


        if (viewType == DataItem.SHOPPING_PAGE_GRADE) {
            view = inflater.inflate(R.layout.listitem_shopping_grade, parent, false);
            return new MyShoppingGradeHolder(view);

        } else if (viewType == DataItem.SHOPPING_PAGE_HISTORY) {
            view = inflater.inflate(R.layout.listitem_shopping_history, parent, false);
            return new MyShoppingHistoryHolder(view);

        } else if (viewType == DataItem.SHOPPING_PAGE_BREAKDOWN) {
            view = inflater.inflate(R.layout.listitem_shopping_breakdown, parent, false);
            return new MyShoppingBreakdownHolder(view);

        } else if (viewType == DataItem.SHOPPING_PAGE_STORE) {
            view = inflater.inflate(R.layout.listitem_shopping_store, parent, false);
            return new MyShoppingStoreHolder(view);

        } else if (viewType == DataItem.SHOPPING_PAGE_TOTAL_EVALUATION) {
            view = inflater.inflate(R.layout.listitem_shopping_totalevaluation, parent, false);
            return new MyShoppingTotalEvaluationHolder(view);

        } else if (viewType == DataItem.SHOPPING_PAGE_EVALUATION) {
            view = inflater.inflate(R.layout.listitem_shopping_evaluation, parent, false);
            return new MyShoppingEvaluationHolder(view);

        } else if (viewType == DataItem.SHOPPING_PAGE_NOTICE) {
            view = inflater.inflate(R.layout.listitem_shopping_notice, parent, false);
            return new MyShoppingNoticeHolder(view);

        } else if (viewType == DataItem.SHOPPING_PAGE_CALL) {
            view = inflater.inflate(R.layout.listitem_shopping_call, parent, false);
            return new MyShoppingCallHolder(view);
        } else {
            view = inflater.inflate(R.layout.listitem_shopping_inquiry, parent, false);
            return new MyShoppingInquiryHolder(view);
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
        return 15;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return DataItem.SHOPPING_PAGE_GRADE; // 회원등급
        } else if (position == 1) {
            return DataItem.SHOPPING_PAGE_HISTORY; // 보관 판매내역
        } else if (position == 2) {
            return DataItem.SHOPPING_PAGE_BREAKDOWN; // 상세 보관판매 내역
        } else if (position == 3) {
            return DataItem.SHOPPING_PAGE_STORE; // 보관 신청
        } else if (position == 4) {
            return DataItem.SHOPPING_PAGE_HISTORY; // 구매내역
        } else if (position == 5) {
            return DataItem.SHOPPING_PAGE_BREAKDOWN; // 상세 구매내역
        } else if (position == 6) {
            return DataItem.SHOPPING_PAGE_HISTORY; // 판매내역
        } else if (position == 7) {
            return DataItem.SHOPPING_PAGE_BREAKDOWN; // 상세 판매내역
        } else if (position == 8) {
            return DataItem.SHOPPING_PAGE_HISTORY; // 보유상품
        } else if (position == 9) {
            return DataItem.SHOPPING_PAGE_TOTAL_EVALUATION; // 총 평가 금액
        } else if (position == 10) {
            return DataItem.SHOPPING_PAGE_EVALUATION; // 보유수량 총구매가
        } else if (position == 11) {
            return DataItem.SHOPPING_PAGE_EVALUATION; // 총수익률 평간손익
        } else if (position == 12) {
            return DataItem.SHOPPING_PAGE_NOTICE; // 6탭
        } else if (position == 13) {
            return DataItem.SHOPPING_PAGE_CALL; // 고객센터 번호
        } else if (position == 14) {
            return DataItem.SHOPPING_PAGE_LAST; // 라스트 2탭
        } else {
            return -1;
        }
    }
}