package com.mthaler.mvc


class Student {
    lateinit var firstName: String
    lateinit var lastName: String

    private var country: String? = null

    private var countryOptions: LinkedHashMap<String, String>? = null

    private var favoriteLanguage: String? = null

    private var operatingSystems: Array<String>? = null

    init {
        // populate country options: used ISO country code
        countryOptions = LinkedHashMap()
        countryOptions!!["BR"] = "Brazil"
        countryOptions!!["FR"] = "France"
        countryOptions!!["DE"] = "Germany"
        countryOptions!!["IN"] = "India"
        countryOptions!!["US"] = "United States of America"
    }
}