package com.homework.springdemo.mvc.domain

import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size


class Customer {
    var firstName: String? = null
    var lastName: @NotNull(message = "is required") @Size(min = 1, message = "is required") String = ""

    @Min(value = 0, message = "Must be greater or equals to 0")
    @Max(value = 10, message = "Must be less or equals to 10")
    var freePasses = 0L
}