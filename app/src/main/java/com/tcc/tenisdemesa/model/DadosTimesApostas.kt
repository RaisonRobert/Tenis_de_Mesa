package com.tcc.tenisdemesa.model

data class DadosTimesApostas(
    var time1: String,
    var time2: String,
    var cota1: Float,
    var cota2: Float,
    var dataJogo: String,
    var anoJogo: String,
    var horaJogo: String,
    val cor1: Int,
    val cor2:Int
) {
    override fun toString(): String {
        return "DadosTimesApostas(time1=$time1, time2=$time2, cota1=$cota1, cota2=$cota2, dataJogo='$dataJogo', anoJogo='$anoJogo', horaJogo='$horaJogo')"
    }
}
