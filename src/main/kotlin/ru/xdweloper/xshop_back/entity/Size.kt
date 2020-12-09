package ru.xdweloper.xshop_back.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 *@created 02 Декабрь 2020 - 9:28
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

@Entity
data class Size (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val size_name: String
)
