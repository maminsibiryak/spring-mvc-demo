package com.homework.springdemo.mvc.controller.domain


class Student {
    var firstName: String? = ""
    var lastName: String? = ""
    var country: String = ""
    var favoriteLanguage: String? = ""
    var operatingSystems = arrayListOf<String>()

    var favoriteLanguageOptions = linkedMapOf<String, String>(
            "Java" to "Java",
            "C#" to "C#",
            "PHP" to "PHP",
            "Ruby" to "Ruby"
    )
}