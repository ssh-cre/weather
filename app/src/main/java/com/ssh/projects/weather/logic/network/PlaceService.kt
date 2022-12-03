package com.ssh.projects.weather.logic.network


import com.ssh.projects.weather.WeatherApplication
import com.ssh.projects.weather.logic.model.PlaceResponse
import retrofit2.Call

import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?&token=${WeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlace(@Query("query") query:String): Call<PlaceResponse>
}