package ru.xdweloper.xshop_back.pojo

data class User (
        val email:String,
        val password: String,
        val returnSecureToken: Boolean
)
