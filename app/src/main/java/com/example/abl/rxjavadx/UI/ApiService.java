package com.example.abl.rxjavadx.UI;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ABL on 08.02.2018.
 */

public interface ApiService {

    @GET("vacancies?text=php&area=40")
    Call<ServiceS> getTopRatedMovies();
}
