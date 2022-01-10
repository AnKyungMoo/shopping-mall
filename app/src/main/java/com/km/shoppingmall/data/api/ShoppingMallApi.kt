package com.km.shoppingmall.data.api

import com.km.shoppingmall.common.ShoppingMallRetrofit
import com.km.shoppingmall.data.service.ShoppingMallService

object ShoppingMallApi {
    fun getShoppingMallService(): ShoppingMallService =
        ShoppingMallRetrofit.retrofit.create(ShoppingMallService::class.java)
}
