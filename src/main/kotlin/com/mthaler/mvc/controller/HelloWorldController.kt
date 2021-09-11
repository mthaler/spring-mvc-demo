package com.mthaler.mvc.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpServletRequest


@Controller
@RequestMapping("/hello")
class HelloWorldController {
    // need a controller method to show the initial HTML form

    // need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    fun showForm(): String {
        return "helloworld-form"
    }

    // need a controller method to process the HTML form

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    fun processForm(): String {
        return "helloworld"
    }

    // new a controller method to read form data and
    // add data to the model

    // new a controller method to read form data and
    // add data to the model
    @RequestMapping("/processFormVersionTwo")
    fun letsShoutDude(request: HttpServletRequest, model: Model): String {

        // read the request parameter from the HTML form
        var theName = request.getParameter("studentName")

        // convert the data to all caps
        theName = theName.toUpperCase()

        // create the message
        val result = "Yo! $theName"

        // add message to the model
        model.addAttribute("message", result)
        return "helloworld"
    }

    @RequestMapping("/processFormVersionThree")
    fun processFormVersionThree(
        @RequestParam("studentName") theName: String,
        model: Model
    ): String {

        // convert the data to all caps
        var theName = theName
        theName = theName.toUpperCase()

        // create the message
        val result = "Hey My Friend from v3! $theName"

        // add message to the model
        model.addAttribute("message", result)
        return "helloworld"
    }
}