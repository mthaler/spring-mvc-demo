package com.mthaler.mvc

import com.mthaler.mvc.MainApplication.Companion.logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.context.support.XmlWebApplicationContext
import java.util.*

@SpringBootApplication
open class MainApplication {

    init {
        val c = XmlWebApplicationContext()
        val config = defaultConfigLocations(c)
        logger.info(c.displayName)
        logger.info(Arrays.toString(config))
    }

    protected open fun defaultConfigLocations(c: XmlWebApplicationContext): Array<String>? {
        return if (c.namespace != null) {
            arrayOf(XmlWebApplicationContext.DEFAULT_CONFIG_LOCATION_PREFIX + c.namespace + XmlWebApplicationContext.DEFAULT_CONFIG_LOCATION_SUFFIX)
        } else {
            arrayOf(XmlWebApplicationContext.DEFAULT_CONFIG_LOCATION)
        }
    }

    companion object {
        val logger = LoggerFactory.getLogger(MainApplication.javaClass)
    }
}
fun main(args: Array<String>) {
    runApplication<MainApplication>(*args)
}

