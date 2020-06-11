package com.paysera.lib.savings.entities.requests

import com.paysera.lib.savings.entities.Period
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import org.joda.money.Money

@JsonClass(generateAdapter = true)
data class CreateAutomatedFillRequest(
    var amount: Money? = null,
    @Json(name = "from_account")
    var fromAccount: String? = null,
    @Json(name = "to_account")
    var toAccount: String? = null,
    var period: Period? = null
) {
    companion object {
        val PERIOD_TYPE_MONTHLY = "monthly"
        val PERIOD_TYPE_WEEKLY = "weekly"
    }
}