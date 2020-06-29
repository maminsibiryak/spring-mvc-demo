package com.homework.springdemo.mvc.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HelloWorldController {
    //need a controller method to show initial form

    @RequestMapping("/showForm")
    fun showForm() :String{
        return "helloworld-form"
    }
    //need a controller method to process the HTML form
    @RequestMapping("/processForm")
    fun processForm():String{
        return "helloworld"
    }
}