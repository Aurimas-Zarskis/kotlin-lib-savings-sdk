package com.paysera.lib.savings.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import org.joda.money.Money

@JsonClass(generateAdapter = true)
data class AutomatedFill(
    val id: String,
    val amount: Money,
    @Json(name = "from_account")
    val fromAccount: String,
    @Json(name = "to_account")
    val toAccount: String,
    val period: AutomatedFillPeriod,
    @Json(name = "created_by")
    val createdBy: Int
)