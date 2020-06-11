package com.paysera.lib.savings.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Period(
    var type: String?,
    @Json(name = "month_day")
    var monthDay: Int?,
    @Json(name = "week_day")
    var weekDay: Int?
)