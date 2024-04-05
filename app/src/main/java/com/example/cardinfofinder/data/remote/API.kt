package com.example.cardinfofinder.data.remote

import com.example.cardinfofinder.data.model.BankBody
import com.example.cardinfofinder.data.model.BankResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface API {

    @GET("{bin}")
    suspend fun doBankCall(@Path("bin") bin: String): BankResponse

}