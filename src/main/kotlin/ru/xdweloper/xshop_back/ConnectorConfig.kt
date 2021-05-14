package ru.xdweloper.xshop_back

import org.apache.catalina.Context
import org.apache.catalina.connector.Connector
import org.apache.tomcat.util.descriptor.web.SecurityCollection
import org.apache.tomcat.util.descriptor.web.SecurityConstraint
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory
import org.springframework.boot.web.servlet.server.ServletWebServerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


/**
 *@created 05 Январь 2021 - 14:10
 *@project Xshop_back
 *@author Dmitry Hvastunov
 */

//@Configuration
//class ConnectorConfig {
//    @Bean
//    fun servletContainer(): ServletWebServerFactory? {
//        val tomcat: TomcatServletWebServerFactory = object : TomcatServletWebServerFactory() {
//            override fun postProcessContext(context: Context) {
//                val securityConstraint = SecurityConstraint()
//                securityConstraint.userConstraint = "CONFIDENTIAL"
//                val collection = SecurityCollection()
//                collection.addPattern("/*")
//                securityConstraint.addCollection(collection)
//                context.addConstraint(securityConstraint)
//            }
//        }
//        tomcat.addAdditionalTomcatConnectors(redirectConnector())
//        return tomcat
//    }
//
//    private fun redirectConnector(): Connector? {
//        val connector = Connector("org.apache.coyote.http11.Http11NioProtocol")
//        connector.scheme = "http"
//        connector.port = 5000
//        connector.secure = false
//        connector.redirectPort = 5000
//        return connector
//    }
//}
