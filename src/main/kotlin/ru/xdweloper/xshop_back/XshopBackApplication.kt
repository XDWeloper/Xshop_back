package ru.xdweloper.xshop_back

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
//@EnableAspectJAutoProxy
class XshopBackApplication



fun main(args: Array<String>) {
	runApplication<XshopBackApplication>(*args)
}

inline fun <reified T> T.logI(text: String, vararg variable: String) {
	LoggerFactory.getLogger(T::class.java).info(text, variable)
}

inline fun <reified T> T.logD(text: String, vararg variable: String) {
	LoggerFactory.getLogger(T::class.java).debug(text, variable)
}

inline fun <reified T> T.logW(text: String, vararg variable: String) {
	LoggerFactory.getLogger(T::class.java).warn(text, variable)
}

inline fun <reified T> T.logE(text: String, vararg variable: String) {
	LoggerFactory.getLogger(T::class.java).error(text, variable)
}

inline fun <reified T> T.logE(text: String, e: Throwable) {
	LoggerFactory.getLogger(T::class.java).error(text, e)
}
