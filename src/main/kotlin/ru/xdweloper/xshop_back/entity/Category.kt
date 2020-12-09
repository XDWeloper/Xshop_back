package ru.xdweloper.xshop_back.entity

import javax.persistence.*

/**
 *@created 01 Декабрь 2020 - 12:23
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

@Entity
data class Category(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val name: String? = "",

        @OneToMany(mappedBy = "categoryId", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
        val subCategory: Collection<SubCategory>? = null
)
