package ru.xdweloper.xshop_back.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 *@created 05 Декабрь 2020 - 15:06
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

@Entity
data class IndividualParams(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val orderId: Long,
        val height: Int? = null,
        val weight: Float? = null,
        val bustAround: Int? = null

)
