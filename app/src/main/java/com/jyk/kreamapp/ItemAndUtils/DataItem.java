package com.jyk.kreamapp.ItemAndUtils;

import java.util.ArrayList;

// 데이터클래스
public class DataItem {
    public static final int HOME_TODAY_BANNER = 1110;
    public static final int HOME_TODAY_CATEGORY = 1120;
    public static final int HOME_TODAY_PRODUCT = 1130;
    public static final int HOME_TODAY_STYLE = 1140;

    public static final int HOME_INFO_BANNER = 1210;
    public static final int HOME_INFO_CATEGORY = 1220;
    public static final int HOME_INFO_PRODUCT = 1230;


    public static final int STYLE_PAGE_FIRST = 2110;
    public static final int STYLE_PAGE_SECOND = 2120;


    public static final int SHOP_PAGE_BANNER = 3110;
    public static final int SHOP_PAGE_CATEGORY = 3120;
    public static final int SHOP_PAGE_BRAND = 3130;
    public static final int SHOP_PAGE_ALIGNMENT = 3140;
    public static final int SHOP_PAGE_PRODUCT = 3150;

    public static final int WATCH_PAGE_FILTER = 3210;
    public static final int WATCH_PAGE_YOUTUBE = 3220;



    public static final int SHOPPING_PAGE_GRADE = 4110;
    public static final int SHOPPING_PAGE_HISTORY = 4120;
    public static final int SHOPPING_PAGE_BREAKDOWN = 4130;
    public static final int SHOPPING_PAGE_STORE = 4140;
    public static final int SHOPPING_PAGE_TOTAL_EVALUATION = 4150;
    public static final int SHOPPING_PAGE_EVALUATION = 4160;
    public static final int SHOPPING_PAGE_NOTICE = 4170;
    public static final int SHOPPING_PAGE_CALL = 4180;
    public static final int SHOPPING_PAGE_LAST = 4190;

    public static final int PROFILE_PAGE_GRADE = 4201;
    public static final int PROFILE_PAGE_CAPTURE = 4202;



    public String number;
    private int viewType;
    // 외부 호출용 생성자
    public DataItem(String number, int viewType) {
        this.number = number;
        this.viewType = viewType;
    }

    public String getNumber() {
        return number;
    }

    public int getViewType() {
        return viewType;
    }

    public static ArrayList<DataItem> dataItems(int num) {
        ArrayList<DataItem> dataItems = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            int viewType;
            if (i % 2 == 0) {
                viewType = 1;
            } else {
                viewType = 2;
            }

            // (i %2 == 0) ? 1 : 2
            dataItems.add(new DataItem("HELLO", viewType));
        }
        return dataItems;
    }
}
