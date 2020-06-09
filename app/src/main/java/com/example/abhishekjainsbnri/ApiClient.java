package com.example.abhishekjainsbnri;

import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {


    private static Retrofit retrofit;
    private static ApiClientService apiClientService;

   public static Retrofit getRetrofit() {
        if (retrofit == null) {
            Retrofit.Builder builder;
            builder = new Retrofit.Builder()
                    .baseUrl("https://api.github.com/orgs/octokit/")
                    .addConverterFactory(GsonConverterFactory.create());
            retrofit = builder.build();
        }

        return retrofit;

    }

    public static ApiClientService getApiClientService() {
        if (apiClientService == null) {

            apiClientService = getRetrofit().create(ApiClientService.class);
        }

        return apiClientService;

    }


}
