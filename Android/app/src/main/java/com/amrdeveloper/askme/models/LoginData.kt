package com.amrdeveloper.askme.models

import com.google.gson.annotations.SerializedName

data class LoginData(
    @SerializedName("email")
    val email: String,

    @SerializedName("password")
    val password: String
){
    fun isValidEmail() : Boolean{
        return true
    }

    fun isValidPassword() : Boolean{
        return true
    }
}