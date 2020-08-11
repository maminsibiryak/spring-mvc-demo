package com.homework.springdemo.mvc.controller.domain

import org.springframework.beans.factory.annotation.Value
import java.util.*


@Value("#{countryOptions}")
private val countryOptions: Map<String, String>? = null

class Student {
    var firstName: String? = ""
    var lastName: String? = ""
    var country: String = ""
    var countryOptions: LinkedHashMap<String, String> = linkedMapOf()
    var favoriteLanguage: String? = ""
    var operatingSystems = arrayListOf<String>()

    var favoriteLanguageOptions = linkedMapOf<String, String>(
            "Java" to "Java",
            "C#" to "C#",
            "PHP" to "PHP",
            "Ruby" to "Ruby"
    )


    constructor()

}