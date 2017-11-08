package com.royle.rovhero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.royle.rovhero.model.HeroData;

public class DetailActivity extends AppCompatActivity {

    private ImageView imageViewHeroBanner;
    private ImageView imageViewHeroIcon;
    private TextView textViewHeroName;
    private ImageView imageViewHeroType;
    private ImageView imageViewSkill1;
    private ImageView imageViewSkill2;
    private ImageView imageViewSkill3;
    private ImageView imageViewSkill4;
    private TextView textViewTitle;
    private TextView textViewDesc;

    private HeroData heroData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        bindView();

        heroData = getIntent().getParcelableExtra("KEY_DATA");

        textViewHeroName.setText(heroData.getHeroName());
        textViewTitle.setText(heroData.getTitleDesc());
        textViewDesc.setText(heroData.getDesc());

        Glide.with(this)
                .load(heroData.getHeroBanner())
                .into(imageViewHeroBanner);

        Glide.with(this)
                .load(heroData.getHeroIcon())
                .into(imageViewHeroIcon);

        Glide.with(this)
                .load(heroData.getSkill().getSkill1())
                .into(imageViewSkill1);

        Glide.with(this)
                .load(heroData.getSkill().getSkill2())
                .into(imageViewSkill2);

        Glide.with(this)
                .load(heroData.getSkill().getSkill3())
                .into(imageViewSkill3);

        Glide.with(this)
                .load(heroData.getSkill().getSkill4())
                .into(imageViewSkill4);

        Glide.with(this)
                .load(getImageHeroType(heroData.getHeroType()))
                .into(imageViewHeroType);

    }

    private void bindView() {
        imageViewHeroBanner = findViewById(R.id.detail_imv_hero_banner);
        imageViewHeroIcon = findViewById(R.id.detail_imv_hero_icon);
        textViewHeroName = findViewById(R.id.detail_tv_hero_name);
        imageViewHeroType = findViewById(R.id.detail_imv_hero_type);
        imageViewSkill1 = findViewById(R.id.detail_imv_skill1);
        imageViewSkill2 = findViewById(R.id.detail_imv_skill2);
        imageViewSkill3 = findViewById(R.id.detail_imv_skill3);
        imageViewSkill4 = findViewById(R.id.detail_imv_skill4);
        textViewTitle = findViewById(R.id.detail_tv_title);
        textViewDesc = findViewById(R.id.detail_tv_decs);
    }

    public int getImageHeroType(String heroType) {
        if ("assassin".equals(heroType)) {
            return R.drawable.ic_hero_type_assassin;
        } else if ("carey".equals(heroType)) {
            return R.drawable.ic_hero_type_carey;
        } else if ("fighter".equals(heroType)) {
            return R.drawable.ic_hero_type_fighter;
        } else if ("mage".equals(heroType)) {
            return R.drawable.ic_hero_type_mage;
        } else if ("tank".equals(heroType)) {
            return R.drawable.ic_hero_type_tank;
        } else {
            return 0;
        }
    }
}
