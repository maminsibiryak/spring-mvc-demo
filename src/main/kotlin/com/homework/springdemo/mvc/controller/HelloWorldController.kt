package com.homework.springdemo.mvc.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletRequest


@Controller
class HelloWorldController {
    //need a controller method to show initial form
    @RequestMapping("/showForm")
    fun showForm(): String {
        return "helloworld-form"
    }

    //need a controller method to process the HTML form
    @RequestMapping("/processForm")
    fun processForm(): String {
        return "helloworld"
    }

    //new a controller method to read form data and
    //add data to the model
    @RequestMapping("/processFormVersionTwo")
    fun letsShoutDude(request: HttpServletRequest, model: Model): String {
        //read the request parameter from html form
        //convert the data to UpperCase
        val theName = request.getParameter("studentName").toUpperCase()
        //create the message
        val result = "Yo! $theName "
        //add message from the model
        model.addAttribute("message", result)
        return "helloworld"
    }
}