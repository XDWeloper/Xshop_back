package ru.xdweloper.xshop_back.controllers.interfaces

import ru.xdweloper.xshop_back.entity.SubCategory
import javax.servlet.http.HttpServletRequest

/**
 *@created 01 Декабрь 2020 - 13:12
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */


interface SubCategoryManagerService {
    fun findByAll(): List<SubCategory>
    fun findAllById(id: Long) : SubCategory?
    fun save(subCategory: SubCategory, request: HttpServletRequest): SubCategory
    fun update(subCategory: SubCategory, request: HttpServletRequest) : SubCategory
    fun remove(id: Long, request: HttpServletRequest)
}
