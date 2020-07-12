package com.homework.springdemo.mvc.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class SillyController {
    @RequestMapping("/showForm")
    fun showForm(): String {
        return "helloworld-form"
    }
}