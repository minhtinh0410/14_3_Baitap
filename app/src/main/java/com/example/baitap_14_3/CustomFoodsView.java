package com.example.baitap_14_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomFoodsView extends BaseAdapter {

    Context ctx;
    int layoutItem;

    public CustomFoodsView(Context ctx, int layoutItem, ArrayList<Foods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    ArrayList<Foods> arrayList;

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

    view = LayoutInflater.from(ctx).inflate(layoutItem, viewGroup, false);

        TextView name1 = view.findViewById(R.id.name1);
        TextView name2 = view.findViewById(R.id.name2);
        ImageView imgFoods = view.findViewById(R.id.imgFoods);

        name1.setText(arrayList.get(i).getNameUp());
        name2.setText(arrayList.get(i).getNameUn());
        imgFoods.setImageResource(arrayList.get(i).getImageFoods());
        return view;
    }
}
