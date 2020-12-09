package ru.xdweloper.xshop_back.aspects

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component
import ru.xdweloper.xshop_back.logI

/**
 *@created 06 Декабрь 2020 - 0:40
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */
@Aspect
@Component
class TrackExecutionTime {

    @Around("@annotation(ru.xdweloper.xshop_back.annotations.TrackExecutionTime)")
    fun TrackTime(joinPoint: ProceedingJoinPoint): Any? {
        val startTime = System.currentTimeMillis()
        val obj = joinPoint.proceed()
        val endTime = System.currentTimeMillis()
        logI("Processed time = " + (endTime - startTime))
        return obj
    }
}
