package ru.xdweloper.xshop_back.entity

import javax.persistence.*

/**
 *@created 02 Декабрь 2020 - 14:04
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

@Entity
@Table(name = "product_sizes")
data class Product_sizes(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private val id: Long,
        private val product_id: Long,
        private val size_id: Long,

        @OneToOne(fetch = FetchType.LAZY, optional = false)
        @JoinColumn(name = "size_id", nullable = false, insertable = false, updatable = false)
        val size: Size
)
