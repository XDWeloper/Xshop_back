package ru.xdweloper.xshop_back.controllers.interfaces

import ru.xdweloper.xshop_back.entity.Product
import javax.servlet.http.HttpServletRequest

/**
 *@created 30 Ноябрь 2020 - 16:44
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */


interface ProductManagerService {

    fun findByAll(): List<Product>
    fun findById(id: Long?): Product?
    fun create(product: Product?, request: HttpServletRequest): Product?
    fun update(product: Product?, request: HttpServletRequest): Product?
    fun delete(id: Long?, request: HttpServletRequest): Unit?
}
