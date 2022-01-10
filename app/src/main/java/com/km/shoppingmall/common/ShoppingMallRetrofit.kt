package com.km.shoppingmall.common

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ShoppingMallRetrofit {
    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("http://211.187.104.112/")
            .client(getOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun getOkHttpClient() =
        OkHttpClient.Builder().addInterceptor(HttpLoggingInterceptor()).build()
}
