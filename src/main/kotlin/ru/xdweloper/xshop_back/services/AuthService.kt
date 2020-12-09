package ru.xdweloper.xshop_back.services

import io.jsonwebtoken.Claims
import io.jsonwebtoken.JwtException
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.util.*

/**
 *@created 03 Декабрь 2020 - 16:04
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

@Service
class AuthService (
        @Value("\${ProjectProperties.expiresIn}")
        val validityMiliSeconds: Long,
        @Value("\${ProjectProperties.secretKey}")
        val secretKey: String
){

    fun createToken( username: String?, password: String?): String? {
        val claims: Claims = Jwts.claims().setSubject(username)
        claims.put("password", password)
        val now = Date()
        val validity = Date(now.time + (validityMiliSeconds * 1000))
        return  Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(validity)
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact()
    }

    fun isAuthentificated(token: String): Boolean {
        try {
            val claimsJws = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token)
            return !claimsJws.body.expiration.before(Date())
        } catch (e: JwtException) {
            return false
        }
    }

}
