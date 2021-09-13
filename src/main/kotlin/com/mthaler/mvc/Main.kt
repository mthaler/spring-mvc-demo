package com.mthaler.mvc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
open class MainApplication

fun main(args: Array<String>) {
    runApplication<MainApplication>(*args)
}

