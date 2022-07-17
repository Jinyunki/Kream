package com.jyk.kreamapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.jyk.kreamapp.home.HomeFragment;
import com.jyk.kreamapp.my.MyFragment;
import com.jyk.kreamapp.shop.ShopFragment;
import com.jyk.kreamapp.style.StyleFragment;
import com.jyk.kreamapp.watch.WatchFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int HOME_TAB = 10;
    public static final int STYLE_TAB = 20;
    public static final int SHOP_TAB = 30;
    public static final int WATCH_TAB = 40;
    public static final int MY_TAB = 50;

    LinearLayout llHome;
    HomeFragment homeFragment;

    LinearLayout llStyle;
    StyleFragment styleFragment;

    LinearLayout llShop;
    ShopFragment shopFragment;

    LinearLayout llWatch;
    WatchFragment watchFragment;

    LinearLayout llMy;
    MyFragment myFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        openFragment(HOME_TAB);

        llHome = findViewById(R.id.ll_home);
        llHome.setOnClickListener(MainActivity.this);

        llStyle = findViewById(R.id.ll_style);
        llStyle.setOnClickListener(MainActivity.this);

        llShop = findViewById(R.id.ll_shop);
        llShop.setOnClickListener(MainActivity.this);

        llWatch = findViewById(R.id.ll_watch);
        llWatch.setOnClickListener(MainActivity.this);

        llMy = findViewById(R.id.ll_my);
        llMy.setOnClickListener(MainActivity.this);

    }

    public void openFragment(Fragment fragment) { //프레그먼트를 나타나게 해줌
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragment).commit();
    }

    public void openFragment(int type) {
        switch (type) {
            case HOME_TAB:
                if (homeFragment == null) {
                    homeFragment = new HomeFragment();
                }
                openFragment(homeFragment);
                break;

            case STYLE_TAB:
                if (styleFragment == null) {
                    styleFragment = new StyleFragment();
                }
                openFragment(styleFragment);
                break;

            case SHOP_TAB:
                if (shopFragment == null) {
                    shopFragment = new ShopFragment();
                }
                openFragment(shopFragment);
                break;

            case WATCH_TAB:
                if (watchFragment == null) {
                    watchFragment = new WatchFragment();
                }
                openFragment(watchFragment);
                break;

            case MY_TAB:
                if (myFragment == null) {
                    myFragment = new MyFragment();
                }
                openFragment(myFragment);
                break;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_home:
                openFragment(HOME_TAB);
                break;

            case R.id.ll_style:
                openFragment(STYLE_TAB);
                break;

            case R.id.ll_shop:
                openFragment(SHOP_TAB);
                break;

            case R.id.ll_watch:
                openFragment(WATCH_TAB);
                break;

            case R.id.ll_my:
                openFragment(MY_TAB);
                break;

            default:
                break;
        }
    }
}