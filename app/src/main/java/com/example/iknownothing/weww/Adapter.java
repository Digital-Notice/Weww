package com.example.iknownothing.weww;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adapter extends PagerAdapter{

    private List<Model> models;
    private LayoutInflater layoutInflater;
    private Context context;

    public Adapter(List<Model> models,Context context)
    {
        this.models = models;
        this.context = context;
    }
    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.all_notice_layout,container,false);

        TextView title,date,time,venue,details,updatedBy;

        return super.instantiateItem(container, position);


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
