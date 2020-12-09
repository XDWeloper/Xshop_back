package ru.xdweloper.xshop_back.aspects

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.aspectj.lang.reflect.MethodSignature
import org.springframework.stereotype.Component
import ru.xdweloper.xshop_back.logI

/**
 *@created 04 Декабрь 2020 - 15:33
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

@Aspect
@Component
class LoggingAspect {

    @Before("Pointcut.allControllers() || Pointcut.allServices()")
    fun logger(point: JoinPoint){
        val methodSignature: MethodSignature = point.signature as MethodSignature
        projectLog("Class name = ${methodSignature.method.toString()}")
        with(point){

            args.let {
                it.forEach {
                    projectLog("variable = $it")
                }
            }
        }
    }

    fun projectLog(logString: String) = logI("Project log: $logString")

}
