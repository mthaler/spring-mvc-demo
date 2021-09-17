package com.mthaler.mvc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class MainApplication {
 init {
     MyWebAppInitializer()
 }
}

fun main(args: Array<String>) {
    runApplication<MainApplication>(*args)
}

