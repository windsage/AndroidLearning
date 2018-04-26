package com.chao.android.learning.net

import com.chao.android.learning.model.HomeData
import com.chao.android.learning.model.HttpResult
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/home/{page}/json")
    fun getHomeList(@Path("page") page: Int): Observable<HttpResult<HomeData>>
}