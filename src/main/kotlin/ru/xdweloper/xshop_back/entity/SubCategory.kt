package ru.xdweloper.xshop_back.entity

import javax.persistence.*

/**
 *@created 01 Декабрь 2020 - 12:51
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

@Entity
@Table(name = "sub_category", schema = "online_shop")
data class SubCategory (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        private val categoryId: Long,
        val name: String? =""
    )
