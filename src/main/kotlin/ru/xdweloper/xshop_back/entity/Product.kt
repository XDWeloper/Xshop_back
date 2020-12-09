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
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val subcategoryid: Long,
        val title: String? = "",
        val photo: String? = null,
        val info: String? = "",
        val price: Float? = 0f,
        val date: Date,
        val articul: String? = null,

        @ManyToMany(cascade = [CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH], fetch = FetchType.LAZY)
        @JoinTable(name = "product_colors",
                joinColumns = [JoinColumn(name = "product_id")],
                inverseJoinColumns = [JoinColumn(name = "color_id")])
        val colors: List<Color>?,

        @ManyToMany(cascade = [CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH], fetch = FetchType.LAZY)
        @JoinTable(name = "product_sizes",
                joinColumns = [JoinColumn(name = "product_id")],
                inverseJoinColumns = [JoinColumn(name = "size_id")])

        val sizes: List<Size>?

        /**
         * Можно сделать так для этого нужно вернуть из cart  таблицы Product_colors и Product_sizes
         * тоже работает нормально но промежуточные таблицы тогда тоже нужно затягивать
         * текущий вариант более правильный.
         *
         * @OneToMany(mappedBy = "product_id", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
         * val colors: List<Product_colors>?,
         *
         * @OneToMany(mappedBy = "product_id", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
         * val sizes: List<Product_sizes>?
*/


)
