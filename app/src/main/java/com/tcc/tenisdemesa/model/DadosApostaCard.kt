package com.tcc.tenisdemesa.model

data class DadosApostaCard(
    var time1: String,
    var time2: String,
    var cota1: Float,
    var cota2: Float,
    var dataJogo: String,
    var anoJogo: String,
    var horaJogo: String,
    val cor1: Int,
    val cor2:Int
)
