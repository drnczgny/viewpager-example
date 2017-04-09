package com.adrian.viewpagerexample.v4;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adrian.viewpagerexample.R;
import com.adrian.viewpagerexample.v4.recyclerview.RecyclerViewAdapter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by cadri on 2017. 03. 26..
 */

public class TabsWithDifferentLayoutsAdapter extends PagerAdapter {

    private static final String TAG = TabsWithDifferentLayoutsAdapter.class.getName();

    private Context context;

    private List<String> titleList;

    private List<DataModel> itemList;

    LayoutInflater layoutInflater;

    public TabsWithDifferentLayoutsAdapter(Context context, List<DataModel> itemList, List<String> titleList) {
        this.context = context;
        this.itemList = itemList;
        this.titleList = titleList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        DataModel dataModelForDifferentLayouts = itemList.get(position);

        View itemView = layoutInflater.inflate(dataModelForDifferentLayouts.getLayoutId(), collection, false);

        if(position ==3) {
            Log.i(TAG, " most");
            RecyclerView recyclerView = (RecyclerView) itemView.findViewById(R.id.recyclerView);
            RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(context, Arrays.asList("one", "two", "three"));
            recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
            recyclerView.setAdapter(recyclerViewAdapter);
        }

        collection.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
