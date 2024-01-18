package com.jbrunoo.subwaytraveler.presentation.network

import com.jbrunoo.subwaytraveler.BuildConfig
import com.jbrunoo.subwaytraveler.presentation.model.Subway
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("${BuildConfig.OPEN_API_KEY}/json/realtimeStationArrival")
    fun getSubwayInfo(
        @Query("START_INDEX") startIndex: String,
        @Query("END_INDEX") endIndex: String,
        @Path("statnNm") statnNm: String
    ): Call<Subway>

}