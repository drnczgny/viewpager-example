package com.adrian.viewpagerexample.v2;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.adrian.viewpagerexample.R;

import java.util.List;

/**
 * Created by cadri on 2017. 03. 26..
 */

public class TabsWithIconAdapter extends PagerAdapter {

    private static final String TAG = TabsWithIconAdapter.class.getName();

    private Context context;

    private List<DataModel> itemList;

    LayoutInflater layoutInflater;

    public TabsWithIconAdapter(Context context, List<DataModel> itemList) {
        this.context = context;
        this.itemList = itemList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        View itemView = layoutInflater.inflate(R.layout.viewpager_item, collection, false);
        TextView tvViewPagerText = (TextView) itemView.findViewById(R.id.tvViewPagerText);

        DataModel dataModel = itemList.get(position);
        tvViewPagerText.setText(dataModel.getText());

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

}
