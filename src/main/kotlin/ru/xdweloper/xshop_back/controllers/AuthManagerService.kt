package ru.xdweloper.xshop_back.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.*
import ru.xdweloper.xshop_back.Enviroment.AUTH_POINT
import ru.xdweloper.xshop_back.Enviroment.BASE_URL
import ru.xdweloper.xshop_back.pojo.AuthResponse
import ru.xdweloper.xshop_back.pojo.User
import ru.xdweloper.xshop_back.services.AuthService

/**
 *@created 03 Декабрь 2020 - 15:29
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

@RestController
@RequestMapping(BASE_URL)
@CrossOrigin
class AuthManagerService(
        @Value("\${ProjectProperties.expiresIn}")
        val expiresIn: Int,
        val authService: AuthService
) {

    @PostMapping("$AUTH_POINT")
    fun autentification(@RequestBody user: User): AuthResponse {
        return AuthResponse(expiresIn,authService.createToken(user.email, user.password))
    }


}
