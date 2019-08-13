package com.etekcity.hellc.testmain;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Nick on 2018/3/6.
 */

public class NoSlideViewPager extends ViewPager {
    public NoSlideViewPager(Context context) {
        super(context);
    }

    public NoSlideViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }
}
