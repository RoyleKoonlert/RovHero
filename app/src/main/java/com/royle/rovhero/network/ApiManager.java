package com.royle.rovhero.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by RoyleKoonlert on 31/10/2017 AD.
 */

public class ApiManager {
    private static HeroService heroService;

    public static HeroService getHeroService() {
        if (heroService == null) {
            heroService = new Retrofit.Builder()
                    .baseUrl(RovHeroUrl.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(HeroService.class);
        }
        return heroService;
    }
}
