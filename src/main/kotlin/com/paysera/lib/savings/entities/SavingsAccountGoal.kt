package com.paysera.lib.savings.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import org.joda.money.Money
import java.util.*

@JsonClass(generateAdapter = true)
data class SavingsAccountGoal(
    val amount: Money?,
    @Json(name = "date_until")
    val dateUntil: Date?
)