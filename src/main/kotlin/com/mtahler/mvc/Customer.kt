package com.mtahler.mvc

import com.mtahler.mvc.validation.CourseCode
import javax.validation.constraints.*

open class Customer {

    private val firstName: String? = null

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private val lastName: String? = null

    @NotNull(message = "is required")
    private val freePasses: @Min(value = 0, message = "must be greater than or equal to zero") @Max(
        value = 10,
        message = "must be less than or equal to 10"
    ) Int? = null

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private val postalCode: String? = null

    @CourseCode(value = "TOPS", message = "must start with TOPS")
    private val courseCode: String? = null
}