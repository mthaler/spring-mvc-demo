package com.mthaler.mvc

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class HomeController {

    @RequestMapping("/")
    fun showPage(): String {
        return "main-menu"
    }
}