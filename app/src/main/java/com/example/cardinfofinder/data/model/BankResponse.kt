package com.example.cardinfofinder.data.model

data class BankResponse(
    val number: BinNumber,
    val scheme: String,
    val type: String,
    val brand: String,
    val prepaid: Boolean,
    val country: BinCountry,
    val bank: BankDetails
)

data class BinNumber(
    val length: Int,
    val luhn: Boolean
)

data class BankDetails(
    val name: String,
    val url: String,
    val phone: String,
    val city: String
)

data class BinCountry(
    val numeric: String,
    val alpha2: String,
    val name: String,
    val emoji: String,
    val currency: String,
    val latitude: Number,
    val longitude: Number
)