package com.km.shoppingmall.data.dto.responsebody

import com.google.gson.annotations.SerializedName

data class LoginResponseBody(
    @SerializedName("access") val access: String,
    @SerializedName("refresh") val refresh: String
)