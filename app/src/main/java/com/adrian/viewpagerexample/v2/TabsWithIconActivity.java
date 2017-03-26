package com.adrian.viewpagerexample.v2;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.adrian.viewpagerexample.R;
import com.adrian.viewpagerexample.TestData;

public class TabsWithIconActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs_with_icon);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Tabs with icon");
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new TabsWithIconAdapter(this, TestData.getDataModelList()));

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        setTabIcons();
    }

    private void setTabIcons() {
        tabLayout.getTabAt(0).setIcon(R.drawable.icon_small_googleplus);
        tabLayout.getTabAt(1).setIcon(R.drawable.icon_small_linkedin);
        tabLayout.getTabAt(2).setIcon(R.drawable.icon_small_facebook);
    }
}
