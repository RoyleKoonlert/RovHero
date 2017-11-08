package com.royle.rovhero.holder;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.royle.rovhero.DetailActivity;
import com.royle.rovhero.R;
import com.royle.rovhero.model.HeroData;

/**
 * Created by RoyleKoonlert on 31/10/2017 AD.
 */

public class HeroHolder extends RecyclerView.ViewHolder {

    private ImageView imageViewHeroIcon;
    private TextView textViewHeroName;
    private View view;

    public HeroHolder(View itemView) {
        super(itemView);
        view = itemView;
        imageViewHeroIcon = itemView.findViewById(R.id.imv_hero_icon);
        textViewHeroName = itemView.findViewById(R.id.tv_hero_name);
    }

    public void onBind(final HeroData heroData) {
        textViewHeroName.setText(heroData.getHeroName());

        Glide.with(view)
                .load(heroData.getHeroIcon())
                .into(imageViewHeroIcon);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                intent.putExtra("KEY_DATA", heroData);
                view.getContext().startActivity(intent);
            }
        });

    }

}
