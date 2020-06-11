package com.paysera.lib.savings.entities.requests

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateSavingsAccountRequest(
    var type: String? = null
)