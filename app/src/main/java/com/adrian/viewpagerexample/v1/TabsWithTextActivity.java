package com.adrian.viewpagerexample.v1;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.adrian.viewpagerexample.R;
import com.adrian.viewpagerexample.TestData;

public class TabsWithTextActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs_with_text);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Tabs with text");
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new TabsWithTextAdapter(this, TestData.getDataModelList(), TestData.getTitleList()));

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
