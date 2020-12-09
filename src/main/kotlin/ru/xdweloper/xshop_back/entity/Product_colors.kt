package ru.xdweloper.xshop_back.entity

import javax.persistence.*

/**
 *@created 02 Декабрь 2020 - 9:50
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

@Entity
@Table(name = "product_colors")
data class Product_colors(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private val id: Long,
        private val product_id: Long,
        private val color_id: Long,

        @OneToOne(fetch = FetchType.LAZY, optional = false)
        @JoinColumn(name = "color_id", nullable = false, insertable = false, updatable = false  )
        val color: Color
)
