package com.mthaler.mvc

import org.slf4j.LoggerFactory
import org.springframework.boot.Banner
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Main

fun main(args: Array<String>) {
    runApplication<Main>(*args) {
        setBannerMode(Banner.Mode.OFF)
        MyWebApplicationInitializer()
    }
}