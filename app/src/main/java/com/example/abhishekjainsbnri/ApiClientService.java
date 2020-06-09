package com.example.abhishekjainsbnri;

import com.example.abhishekjainsbnri.dataclass.AllDetail;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiClientService {

    @GET("https://api.github.com/orgs/octokit/repos")
    Call<List<AllDetail>> getList(@Query("page") int page, @Query("per_page") int per_page);



}
