package ru.xdweloper.xshop_back.controllers

import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.*
import ru.xdweloper.xshop_back.Enviroment.ALL_URL
import ru.xdweloper.xshop_back.Enviroment.BASE_URL
import ru.xdweloper.xshop_back.Enviroment.CATEGORY_URL
import ru.xdweloper.xshop_back.Enviroment.CREATE_URL
import ru.xdweloper.xshop_back.Enviroment.DELETE_URL
import ru.xdweloper.xshop_back.Enviroment.FIND_URL
import ru.xdweloper.xshop_back.Enviroment.UPDATE_URL
import ru.xdweloper.xshop_back.dao.CategoryDao
import ru.xdweloper.xshop_back.entity.Category
import ru.xdweloper.xshop_back.controllers.interfaces.CategoryManagerService
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping(value = [BASE_URL, CATEGORY_URL])
@CrossOrigin
class CategoryManagerServiceImpl(
        private val categoryDao: CategoryDao
): CategoryManagerService  {

    @GetMapping(value = ["$ALL_URL"])
    override fun findByAll(): List<Category> = categoryDao.findAll()


    @GetMapping(value = ["$FIND_URL"])
    override fun findAllById(@PathVariable id: Long): Category? = categoryDao.findByIdOrNull(id)

    @PostMapping(value = ["$CREATE_URL"])
    override fun save(@RequestBody category: Category, request: HttpServletRequest): Category {
       return categoryDao.save(category)
    }

    @PutMapping(value = ["$UPDATE_URL"])
    override fun update(@RequestBody category: Category, request: HttpServletRequest): Category = categoryDao.save(category)

    @DeleteMapping(value = ["$DELETE_URL"])
    override fun remove(@PathVariable id: Long, request: HttpServletRequest) = categoryDao.deleteById(id)

}
