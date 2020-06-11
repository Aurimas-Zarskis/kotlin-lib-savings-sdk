package com.paysera.lib.savings.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AutomatedFillPeriod(
    val type: String,
    @Json(name = "month_day")
    val monthDay: Int?,
    @Json(name = "week_day")
    val weekDay: Int?
) {
    companion object {
        val TYPE_MONTHLY = "monthly"
        val TYPE_WEEKLY = "weekly"
    }
}