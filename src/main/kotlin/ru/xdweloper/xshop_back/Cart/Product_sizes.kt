//package ru.xdweloper.xshop_back.Cart
//
//import ru.xdweloper.xshop_back.entity.Size
//import javax.persistence.*
//
///**
// *@created 02 Декабрь 2020 - 14:04
// *@project Xshop_back
// *@author Dmitry Hvastunov
// */
//
//@Entity
//@Table(name = "product_sizes")
//data class Product_sizes(
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private val id: Long,
//        private val product_id: Long,
//        private val size_id: Long,
//
//        @OneToOne(fetch = FetchType.EAGER, optional = false)
//        @JoinColumn(name = "size_id", nullable = false, insertable = false, updatable = false)
//        val size: Size
//)
