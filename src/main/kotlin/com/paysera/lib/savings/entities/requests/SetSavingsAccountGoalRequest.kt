package com.paysera.lib.savings.entities.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import org.joda.money.Money
import java.util.*

@JsonClass(generateAdapter = true)
data class SetSavingsAccountGoalRequest(
    var amount: Money?,
    @Json(name = "date_until")
    var dateUntil: Date?
)