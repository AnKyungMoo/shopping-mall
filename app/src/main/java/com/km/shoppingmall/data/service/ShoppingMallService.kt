package com.km.shoppingmall.data.service

import com.km.shoppingmall.data.dto.requestbody.LoginRequestBody
import com.km.shoppingmall.data.dto.requestbody.SignUpRequestBody
import retrofit2.http.Body
import retrofit2.http.POST

interface ShoppingMallService {
    // user
    @POST("/users/signup/")
    suspend fun signUp(@Body signUpRequestBody: SignUpRequestBody)

    @POST("/users/login/")
    suspend fun login(@Body loginRequestBody: LoginRequestBody)
}
