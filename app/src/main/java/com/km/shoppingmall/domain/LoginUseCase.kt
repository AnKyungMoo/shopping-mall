package com.km.shoppingmall.domain

import com.km.shoppingmall.base.BaseUseCase
import com.km.shoppingmall.data.dto.requestbody.LoginRequestBody
import com.km.shoppingmall.data.repository.UserRepository
import com.km.shoppingmall.presenter.login.model.LoginModel
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val userRepository: UserRepository) : BaseUseCase() {
    suspend operator fun invoke(loginModel: LoginModel) = execute {
        val loginResponseBody = userRepository.login(LoginRequestBody(
            email = loginModel.email,
            password = loginModel.password
        ))
    }
}
