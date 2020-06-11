package com.paysera.lib.savings.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AutomatedFillsFilter(
    @Json(name = "to_account_numbers")
    val toAccountNumbers: List<String>
)