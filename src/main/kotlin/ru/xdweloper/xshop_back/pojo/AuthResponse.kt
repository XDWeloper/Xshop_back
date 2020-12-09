package ru.xdweloper.xshop_back.pojo

/**
 *@created 03 Декабрь 2020 - 15:47
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

data class AuthResponse (
        val expiresIn: Int,
        val idToken: String?
)
