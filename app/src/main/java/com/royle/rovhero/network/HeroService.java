package com.royle.rovhero.network;

import com.royle.rovhero.model.HeroListData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by RoyleKoonlert on 30/10/2017 AD.
 */

public interface HeroService {

    @GET(RovHeroUrl.LIST_HERO)
    Call<HeroListData> getHeroList();

}
