package com.paysera.lib.savings.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SavingsAccount(
    val type: String,
    @Json(name = "account_number")
    val accountNumber: String,
    val goal: SavingsAccountGoal?,
    @Json(name = "created_by")
    val createdBy: String,
    @Json(name = "display_url")
    val displayUrl: String?
) {
    companion object {
        val TYPE_PRIVATE = "private"
        val TYPE_PUBLIC = "public"
    }
}