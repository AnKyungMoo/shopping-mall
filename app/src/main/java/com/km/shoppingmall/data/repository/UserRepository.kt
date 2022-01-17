package com.km.shoppingmall.data.repository

import com.km.shoppingmall.data.dto.requestbody.LoginRequestBody
import com.km.shoppingmall.data.dto.requestbody.SignUpRequestBody
import com.km.shoppingmall.data.dto.responsebody.LoginResponseBody

interface UserRepository {
    suspend fun signUp(signUpRequestBody: SignUpRequestBody)

    suspend fun login(loginRequestBody: LoginRequestBody): LoginResponseBody
}
