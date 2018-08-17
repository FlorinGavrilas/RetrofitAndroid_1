package com.siveco.fg.retrofitandroid_1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {


    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
