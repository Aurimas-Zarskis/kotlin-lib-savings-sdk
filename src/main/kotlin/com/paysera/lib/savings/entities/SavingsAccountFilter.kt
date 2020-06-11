package com.paysera.lib.savings.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SavingsAccountFilter(
    @Json(name = "account_numbers")
    val accountNumbers: List<String>
)