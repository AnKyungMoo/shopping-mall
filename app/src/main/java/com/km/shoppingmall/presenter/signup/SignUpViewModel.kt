package com.km.shoppingmall.presenter.signup

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.km.shoppingmall.domain.SignUpUseCase
import com.km.shoppingmall.presenter.signup.model.SignUpModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(private val signUpUseCase: SignUpUseCase) : ViewModel() {
    fun signUp(email: String, password: String, name: String) {
        viewModelScope.launch {
            signUpUseCase(SignUpModel(email, password, name))
        }
    }
}
