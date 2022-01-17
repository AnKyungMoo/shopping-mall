package com.km.shoppingmall.data.dto.requestbody

import com.google.gson.annotations.SerializedName

data class SignUpRequestBody(
    @SerializedName("name") val name: String,
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String
)
