package com.km.shoppingmall.presenter.signup

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.km.shoppingmall.data.repository.UserRepositoryImpl
import com.km.shoppingmall.domain.SignUpUseCase
import com.km.shoppingmall.presenter.signup.model.SignUpModel
import kotlinx.coroutines.launch

class SignUpViewModel : ViewModel() {
    private val signUpUseCase = SignUpUseCase(UserRepositoryImpl())

    fun signUp(email: String, password: String, name: String) {
        viewModelScope.launch {
            signUpUseCase.signUp(SignUpModel(email, password, name))
        }
    }
}
