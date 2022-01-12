package com.km.shoppingmall.presenter

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.km.shoppingmall.presenter.login.LoginActivity
import com.km.shoppingmall.presenter.signup.SignUpActivity
import com.km.shoppingmall.ui.theme.ShoppingMallTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShoppingMallTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val context = LocalContext.current
    Column(modifier = Modifier.padding(10.dp)) {
        Button(onClick = { context.startActivity(Intent(context, SignUpActivity::class.java)) }) {
            Text(text = "회원가입")
        }
        Button(onClick = { context.startActivity(Intent(context, LoginActivity::class.java)) }) {
            Text(text = "로그인")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ShoppingMallTheme {
        MainScreen()
    }
}
