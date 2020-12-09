package ru.xdweloper.xshop_back.entity

import java.sql.Date
import javax.persistence.*

/**
 *@created 30 Ноябрь 2020 - 15:53
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

@Entity
data class Product(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val subcategoryid: Long,
        val title: String? = "",
        val photo: String? = null,
        val info: String? = "",
        val price: Float? = 0f,
        val date: Date,
        val articul: String? = null,

        @OneToMany(mappedBy = "product_id", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
        val colors: List<Product_colors>?,

        @OneToMany(mappedBy = "product_id", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
        val sizes: List<Product_sizes>?

)
