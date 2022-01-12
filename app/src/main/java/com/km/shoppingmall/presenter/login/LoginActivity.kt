package com.km.shoppingmall.presenter.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.km.shoppingmall.presenter.signup.InputComponent
import com.km.shoppingmall.ui.theme.ShoppingMallTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : ComponentActivity() {
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShoppingMallTheme {
                Screen(viewModel)
            }
        }
    }
}

@Composable
fun Screen(viewModel: LoginViewModel) {
    LoginScreen(onClick = viewModel::login)
}

@Composable
fun LoginScreen(onClick: (String, String) -> Unit) {
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Column {
        InputComponent("e-mail", email.value, onValueChange = { email.value = it })
        InputComponent("password", password.value, onValueChange = { password.value = it })
        Button(onClick = { onClick.invoke(email.value, password.value) }) {
            Text(text = "로그인")
        }
    }
}