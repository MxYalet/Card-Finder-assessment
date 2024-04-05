package com.example.cardinfofinder.data.repository

import com.example.cardinfofinder.data.model.BankResponse
import com.example.cardinfofinder.data.remote.API

class Repository(private val api: API) {

    suspend fun fetchBinDetails(bin: String): BankResponse {
        return api.doBankCall(bin)
    }
}