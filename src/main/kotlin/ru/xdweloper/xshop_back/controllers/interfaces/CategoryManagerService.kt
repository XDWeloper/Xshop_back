package ru.xdweloper.xshop_back.controllers.interfaces

import ru.xdweloper.xshop_back.entity.Category
import javax.servlet.http.HttpServletRequest

/**
 *@created 01 Декабрь 2020 - 12:54
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */


interface CategoryManagerService{

    fun findByAll(): List<Category>
    fun findAllById(id: Long) : Category?
    fun save(category: Category, request: HttpServletRequest): Category
    fun update(category: Category, request: HttpServletRequest) : Category
    fun remove(id: Long, request: HttpServletRequest)
}
