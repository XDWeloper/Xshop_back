package ru.xdweloper.xshop_back.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.xdweloper.xshop_back.entity.Category

/**
 *@created 01 Декабрь 2020 - 13:02
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

@Repository
interface CategoryDao: JpaRepository<Category, Long> {
}
