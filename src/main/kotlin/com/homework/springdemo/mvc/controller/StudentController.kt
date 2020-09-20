package com.homework.springdemo.mvc.controller

import com.homework.springdemo.mvc.domain.Student
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping("/student")
class StudentController {
    @Value("#{countryOptions}")
    private val countryOptions: Map<String, String>? = null

    @RequestMapping("/showForm")
    fun showForm(model: Model): String {
        //create a student object
        val student = Student()
        //add student object to the model
        model.addAttribute("student", student)
        model.addAttribute("theCountryOptions", countryOptions)
        return "student-form"
    }

    @RequestMapping("/processForm")
    fun processForm(@ModelAttribute("student") student: Student): String {
        //log the input data
        println("The student ->" + student.firstName + " " + student.lastName)
        return "student-confirmation"
    }
}