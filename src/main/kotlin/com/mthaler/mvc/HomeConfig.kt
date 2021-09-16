package com.mthaler.mvc

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
open class HomeConfig {

    @Bean
    open fun homeService(): HomeService? {
        return HomeService()
    }

    @Bean
    open fun homeRepository(): HomeService? {
        return HomeService()
    }
}