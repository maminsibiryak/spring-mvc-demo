package com.homework.springdemo.mvc.controller.domain

import org.springframework.beans.factory.annotation.Value

@Value("#{countryOptions}")
private val countryOptions: Map<String, String>? = null

class Student {
    var firstName: String? = ""
    var lastName: String? = ""
    var country: String = ""
    var countryOptions: LinkedHashMap<String, String> = linkedMapOf()
    var favoriteLanguage: String? = ""

    constructor()

}