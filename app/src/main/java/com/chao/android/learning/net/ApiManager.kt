package com.chao.android.learning.net

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApiManager {

    private val BASE_URL = "http://www.wanandroid.com/"

    private fun getLogInterceptor(): Interceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    val getHttpService: ApiService by lazy {
        createRetrofitService(ApiService::class.java)
    }

    private fun <T> createRetrofitService(clazz: Class<T>): T {
        val builder = OkHttpClient.Builder().
                addInterceptor(getLogInterceptor()).
                readTimeout(100000, TimeUnit.SECONDS).
                connectTimeout(100000, TimeUnit.SECONDS)
        val retro = Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(builder.build()).build()
        return retro.create(clazz)
    }
}