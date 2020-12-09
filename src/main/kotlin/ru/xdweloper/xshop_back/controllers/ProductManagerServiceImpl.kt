package ru.xdweloper.xshop_back.controllers

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.*
import ru.xdweloper.xshop_back.Enviroment.ALL_URL
import ru.xdweloper.xshop_back.Enviroment.BASE_URL
import ru.xdweloper.xshop_back.Enviroment.CREATE_URL
import ru.xdweloper.xshop_back.Enviroment.DELETE_URL
import ru.xdweloper.xshop_back.Enviroment.FIND_URL
import ru.xdweloper.xshop_back.Enviroment.PRODUCT_URL
import ru.xdweloper.xshop_back.Enviroment.UPDATE_URL
import ru.xdweloper.xshop_back.annotations.TrackExecutionTime
import ru.xdweloper.xshop_back.controllers.interfaces.ProductManagerService
import ru.xdweloper.xshop_back.dao.ProductDao
import ru.xdweloper.xshop_back.entity.Product
import javax.servlet.http.HttpServletRequest


@RestController()
@RequestMapping(value = [BASE_URL, PRODUCT_URL])
@CrossOrigin
class ProductManagerServiceImpl(
        private val productDao: ProductDao
) : ProductManagerService {

    @TrackExecutionTime
    @GetMapping(value = ["$ALL_URL"])
    override fun findByAll(): List<Product> = productDao.findAll()

    @TrackExecutionTime
    @GetMapping(value = ["$FIND_URL"])
    override fun findById(@PathVariable id: Long): Product? = productDao.findByIdOrNull(id)


    @TrackExecutionTime
    @PostMapping(value = ["$CREATE_URL"])
    override fun create(@RequestBody product: Product, request: HttpServletRequest): Product = productDao.save(product)


    @TrackExecutionTime
    @PutMapping(value = ["$UPDATE_URL"])
    override fun update(@RequestBody product: Product, request: HttpServletRequest): Product = productDao.save(product)


    @TrackExecutionTime
    @DeleteMapping(value = ["$DELETE_URL"])
    override fun delete(@PathVariable id: Long, request: HttpServletRequest) = productDao.deleteById(id)

    @TrackExecutionTime
    @GetMapping("/pageable")
    fun findAllByPageable(pageable: Pageable): Page<Product>{
        return productDao.findAll(pageable)
    }
}
