package ru.xdweloper.xshop_back

object Enviroment {

    /**End points*/
    const val BASE_URL = ""
    const val PRODUCT_URL = "products"
    const val CATEGORY_URL = "category"
    const val SUBCATEGORY_URL = "subCategory"
    const val ALL_URL = "all"
    const val FIND_URL = "find/{id}"
    const val CREATE_URL = "create"
    const val UPDATE_URL = "update"
    const val DELETE_URL = "delete/{id}"
    const val AUTH_POINT = "auth"

    /**Named query*/
    const val GET_PRODUCT_COLOR_BY_ID = "select * from product_color p where p.product_id = :prod_id"
    const val GET_PRODUCT_SIZE_BY_ID = "select * from product_size p where p.product_id = :prod_id"



}
