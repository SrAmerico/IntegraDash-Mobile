package com.senai.vsconnect_kotlin.apis

import com.google.gson.JsonObject
import com.senai.vsconnect_kotlin.models.Login
import com.senai.vsconnect_kotlin.models.Alerta
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface EndpointInterface {
    @GET("alertas")
    fun listarAlertas() : Call<List<Alerta>>

    @GET("erros")
    fun listarErros() : Call<List<Alerta>>

    @GET("estrategias")
    fun listarEstrategias() : Call<List<Alerta>>

    @POST("login")
    fun login(@Body usuario: Login) :Call<JsonObject>
}