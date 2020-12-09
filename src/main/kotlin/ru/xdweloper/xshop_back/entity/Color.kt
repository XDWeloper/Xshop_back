package ru.xdweloper.xshop_back.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 *@created 02 Декабрь 2020 - 9:26
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */
@Entity
data class Color(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val color_name: String? = "",
        val color_number: String? = null
)
