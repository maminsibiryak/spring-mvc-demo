package com.homework.springdemo.mvc.domain

import javax.validation.constraints.NotNull
import javax.validation.constraints.Size


class Customer {
    var firstName: String? = null
    var lastName: @NotNull(message = "is required") @Size(min = 1, message = "is required") String = ""
}