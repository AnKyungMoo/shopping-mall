package com.km.shoppingmall.presenter.login

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.km.shoppingmall.base.processMore
import com.km.shoppingmall.domain.LoginUseCase
import com.km.shoppingmall.presenter.login.model.LoginModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val loginUseCase: LoginUseCase) : ViewModel() {
    fun login(email: String, password: String) {
        viewModelScope.launch {
            loginUseCase(LoginModel(email, password)).processMore(
                onSuccess = {
                    Log.d("login", "success")
                },
                onError = {
                    Log.d("login", "fail")
                }
            )
        }
    }
}