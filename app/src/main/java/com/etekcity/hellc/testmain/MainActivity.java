package com.etekcity.hellc.testmain;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private NoSlideViewPager mNoSlideViewPager;
    private CircleIndicator2 mCircleIndicator;

    private ArrayList<Fragment> tabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.main_tab_layout);
        mNoSlideViewPager = findViewById(R.id.main_tab_view_pager);
        mCircleIndicator = findViewById(R.id.circleview);

        SimpleFragment one=SimpleFragment.instance("one");
        SimpleFragment two=SimpleFragment.instance("two");
        mViewPager.
        mCircleIndicator.setUpWithViewPager(mViewPager);
    }
}
