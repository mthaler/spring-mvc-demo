package com.mthaler.mvc

import org.springframework.beans.propertyeditors.StringTrimmerEditor
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.WebDataBinder
import org.springframework.web.bind.annotation.InitBinder
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import javax.validation.Valid

@Controller
@RequestMapping("/customer")
class CustomerController {
    // add an initbinder ... to convert trim input strings
    // remove leading and trailing whitespace
    // resolve issue for our validation
    @InitBinder
    fun initBinder(dataBinder: WebDataBinder) {
        val stringTrimmerEditor = StringTrimmerEditor(true)
        dataBinder.registerCustomEditor(String::class.java, stringTrimmerEditor)
    }

    @RequestMapping("/showForm")
    fun showForm(theModel: Model): String {
        theModel.addAttribute("customer", Customer())
        return "customer-form"
    }

    @RequestMapping("/processForm")
    fun processForm(
        @Valid @ModelAttribute("customer") c: Customer,
        theBindingResult: BindingResult
    ): String {
        System.out.println("Last name: |" + c.lastName + "|")
        return if (theBindingResult.hasErrors()) {
            "customer-form"
        } else {
            "customer-confirmation"
        }
    }
}