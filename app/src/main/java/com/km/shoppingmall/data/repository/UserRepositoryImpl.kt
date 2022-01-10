package com.km.shoppingmall.data.repository

import com.km.shoppingmall.data.api.ShoppingMallApi
import com.km.shoppingmall.data.dto.requestbody.SignUpRequestBody

class UserRepositoryImpl : UserRepository {
    override suspend fun signUp(signUpRequestBody: SignUpRequestBody) {
        ShoppingMallApi.getShoppingMallService().signUp(signUpRequestBody)
    }
}
