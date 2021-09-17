package com.mthaler.mvc

import org.slf4j.LoggerFactory
import org.springframework.web.WebApplicationInitializer
import org.springframework.web.context.support.XmlWebApplicationContext
import org.springframework.web.servlet.DispatcherServlet
import javax.servlet.ServletContext
import javax.servlet.ServletRegistration


class MyWebAppInitializer:  WebApplicationInitializer {

    override fun onStartup(servletContext: ServletContext) {
        val appContext = XmlWebApplicationContext()
        appContext.setConfigLocation("/WEB-INF/spring/spring-mvc-demo-servlet.xml")

        val dispatcher: ServletRegistration.Dynamic = servletContext.addServlet("dispatcher", DispatcherServlet(appContext))
        dispatcher.setLoadOnStartup(1)
        dispatcher.addMapping("/")
    }
}