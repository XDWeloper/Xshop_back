package ru.xdweloper.xshop_back.aspects

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component
import ru.xdweloper.xshop_back.services.AuthService
import javax.servlet.http.HttpServletRequest


/**
 *@created 03 Декабрь 2020 - 22:17
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

@Aspect
@Component
class AuthAspect(
        private val authService: AuthService
) {

  //  @Around( "Pointcut.create() || Pointcut.update() || Pointcut.delete()")
    fun aroundCallAt(processPoint: ProceedingJoinPoint): Any? {
        return processPoint.args
                .find {it is HttpServletRequest }
                .let {
                    val request: HttpServletRequest = it as HttpServletRequest
                    request?.getParameter("auth")
                            .let {
                                return if(authService.isAuthentificated(it.toString())){
                                            processPoint.proceed()
                                        } else null
                            }
                    }
   }

}
