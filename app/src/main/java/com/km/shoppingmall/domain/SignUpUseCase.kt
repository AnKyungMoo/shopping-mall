package com.km.shoppingmall.domain

import com.km.shoppingmall.data.dto.requestbody.SignUpRequestBody
import com.km.shoppingmall.data.repository.UserRepository
import com.km.shoppingmall.presenter.signup.model.SignUpModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class SignUpUseCase @Inject constructor(private val userRepository: UserRepository) {
    suspend operator fun invoke(signUpModel: SignUpModel) {
        val signUpRequestBody = SignUpRequestBody(
            name = signUpModel.name,
            email = signUpModel.email,
            password = signUpModel.password
        )

        withContext(Dispatchers.IO) {
            userRepository.signUp(signUpRequestBody)
        }
    }
}
