package com.example.cho.test_12_02;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.design.widget.TabLayout;

/**
 * Created by cho on 2016-12-02.
 */

public class HomeActivity extends AppCompatActivity {

    private Button htz_Button, button2, addPost_Button; //button2: *logout toolbar 만들어서 정리

    private Button button6;

    private final long FINISH_INTERVAL_TIME = 2000; //종료
    private long backPressedTime = 0; //종료


    TabLayout home_tabLayout;
    ViewPager home_viewPager;
    Home_ViewPagerAdapter home_viewPagerAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_basis);

        home_tabLayout = (TabLayout) findViewById(R.id.home_tab_layout);
        home_viewPager = (ViewPager) findViewById(R.id.home_viewPager);
        home_viewPagerAdapter = new Home_ViewPagerAdapter(getSupportFragmentManager());
        home_viewPagerAdapter.addFragments(new Test1(), getResources().getString(R.string.home_to_info));
        home_viewPagerAdapter.addFragments(new Test2(), getResources().getString(R.string.home_to_mgz));
        home_viewPagerAdapter.addFragments(new Test5(), getResources().getString(R.string.home_to_more));
        home_viewPager.setAdapter(home_viewPagerAdapter);
        home_tabLayout.setupWithViewPager(home_viewPager);
        home_viewPager.setCurrentItem(1, true);

    }


    @Override
    public void onBackPressed() {
        long tempTime = System.currentTimeMillis();
        long intervalTime = tempTime - backPressedTime;

        if (0 <= intervalTime && FINISH_INTERVAL_TIME >= intervalTime) {
            //         super.onBackPressed();
            moveTaskToBack(true);
            finish();
            android.os.Process.killProcess(android.os.Process.myPid());
        } else {
            backPressedTime = tempTime;
            Toast.makeText(getApplicationContext(), "'뒤로' 버튼을 한번 더 누르면 빠져나갑니다. ", Toast.LENGTH_SHORT).show();
        }
    }
    //2번 연속으로 누르면 종료

}

