package com.homework.springdemo.mvc.controller.domain

class Student {
    var firstName: String? = ""
    var lastName: String? = ""
    var country: String = ""
    var countryOptions: LinkedHashMap<String, String> = linkedMapOf()

    constructor() {
        countryOptions["BR"] = "Brazil"
        countryOptions["FR"] = "France"
        countryOptions["RU"] = "Russia"
        countryOptions["US"] = "United State of America"
    }

}