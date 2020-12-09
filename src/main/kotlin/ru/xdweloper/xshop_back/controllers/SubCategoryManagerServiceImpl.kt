package ru.xdweloper.xshop_back.controllers

import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.*
import ru.xdweloper.xshop_back.Enviroment.ALL_URL
import ru.xdweloper.xshop_back.Enviroment.BASE_URL
import ru.xdweloper.xshop_back.Enviroment.CREATE_URL
import ru.xdweloper.xshop_back.Enviroment.DELETE_URL
import ru.xdweloper.xshop_back.Enviroment.FIND_URL
import ru.xdweloper.xshop_back.Enviroment.SUBCATEGORY_URL
import ru.xdweloper.xshop_back.Enviroment.UPDATE_URL
import ru.xdweloper.xshop_back.dao.SubCategoryDao
import ru.xdweloper.xshop_back.entity.SubCategory
import ru.xdweloper.xshop_back.controllers.interfaces.SubCategoryManagerService
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping(value = [BASE_URL, SUBCATEGORY_URL])
class SubCategoryManagerServiceImpl(
        private val subCategoryDao: SubCategoryDao
) : SubCategoryManagerService {

    @GetMapping(value = ["$ALL_URL"])
    override fun findByAll(): List<SubCategory> = subCategoryDao.findAll()

    @GetMapping(value = ["$FIND_URL"])
    override fun findAllById(@PathVariable id: Long): SubCategory? = subCategoryDao.findByIdOrNull(id)

    @PostMapping(value = ["$CREATE_URL"])
    override fun save(@RequestBody subCategory: SubCategory, request: HttpServletRequest): SubCategory = subCategoryDao.save(subCategory)

    @PutMapping(value = ["$UPDATE_URL"])
    override fun update(@RequestBody subCategory: SubCategory, request: HttpServletRequest): SubCategory = subCategoryDao.save(subCategory)

    @DeleteMapping(value = ["$DELETE_URL"])
    override fun remove(@PathVariable id: Long, request: HttpServletRequest) = subCategoryDao.deleteById(id)
}
