package com.royle.rovhero.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.royle.rovhero.R;
import com.royle.rovhero.holder.HeroHolder;
import com.royle.rovhero.model.HeroData;

import java.util.List;

/**
 * Created by RoyleKoonlert on 1/11/2017 AD.
 */

public class HeroListAdapter extends RecyclerView.Adapter {
    private List<HeroData> heroDataList;

    public HeroListAdapter(List<HeroData> heroDataList) {
        this.heroDataList = heroDataList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hero_item, parent, false);
        return new HeroHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof HeroHolder) {
            ((HeroHolder) holder).onBind(heroDataList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return heroDataList.size();
    }
}
