package com.km.shoppingmall.data.dto.requestbody

data class SignUpResponseBody(
    val id: Int,
    val name: String,
    val email: String,
    val password: String
)
