package com.mtahler.mvc.controller

import com.mtahler.mvc.Student
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping("/student")
class StudentController {
    @RequestMapping("/showForm")
    fun showForm(theModel: Model): String? {

        // create a student object
        val theStudent = Student()

        // add student object to the model
        theModel.addAttribute("student", theStudent)
        return "student-form"
    }

    @RequestMapping("/processForm")
    fun processForm(@ModelAttribute("student") theStudent: Student): String? {

        // log the input data
        System.out.println(
            "theStudent: " + theStudent.firstName + " " + theStudent.lastName
        )
        return "student-confirmation"
    }
}