package com.adrian.viewpagerexample.v4.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.adrian.viewpagerexample.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian_Czigany on 3/22/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<String> items = new ArrayList<>();

    private Context context;

    public RecyclerViewAdapter(Context context, List<String> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final String item = items.get(position);

        holder.tvText.setText(item.toString());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvText;

        public MyViewHolder(View view) {
            super(view);
            tvText = (TextView) view.findViewById(R.id.tvText);
        }
    }

}
