package ru.xdweloper.xshop_back.aspects

import org.aspectj.lang.annotation.Pointcut

object Pointcut {
    @Pointcut("execution(* create(..))")
    fun create(){}

    @Pointcut("execution(* update(..))")
    fun update(){}

    @Pointcut("execution(* delete(..))")
    fun delete(){}

    @Pointcut("""
        execution(* ru.xdweloper.xshop_back.controllers.AuthManagerService.*(..))
        || execution(* ru.xdweloper.xshop_back.controllers.CategoryManagerServiceImpl.*(..))
        || execution(* ru.xdweloper.xshop_back.controllers.ProductManagerServiceImpl.*(..))
        || execution(* ru.xdweloper.xshop_back.controllers.SubCategoryManagerServiceImpl.*(..))
        """)
    fun allControllers(){}

    @Pointcut("""
        execution(* ru.xdweloper.xshop_back.controllers.AuthManagerService.*(..)) 
        """)
    fun allServices(){}

    @Pointcut("execution(* *(..))")
    fun allFun(){}

}
