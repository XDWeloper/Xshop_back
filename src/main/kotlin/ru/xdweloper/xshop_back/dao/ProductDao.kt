package ru.xdweloper.xshop_back.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.xdweloper.xshop_back.entity.Product

/**
 *@created 30 Ноябрь 2020 - 16:35
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

@Repository
interface ProductDao: JpaRepository<Product, Long> {
}
