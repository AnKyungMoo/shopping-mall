package com.km.shoppingmall.data.repository

import com.km.shoppingmall.data.dto.requestbody.SignUpRequestBody
import com.km.shoppingmall.data.service.ShoppingMallService
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val shoppingMallService: ShoppingMallService) : UserRepository {
    override suspend fun signUp(signUpRequestBody: SignUpRequestBody) {
        shoppingMallService.signUp(signUpRequestBody)
    }
}
