package com.adrian.viewpagerexample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this, getDataModelList()));
    }

    private List<DataModel> getDataModelList() {
        DataModel dataModel1 = new DataModel("ONE");
        DataModel dataModel2 = new DataModel("TWO");
        DataModel dataModel3 = new DataModel("THREE");
        List<DataModel> list = new ArrayList<>();
        list.add(dataModel1);
        list.add(dataModel2);
        list.add(dataModel3);
        return list;
    }
}
