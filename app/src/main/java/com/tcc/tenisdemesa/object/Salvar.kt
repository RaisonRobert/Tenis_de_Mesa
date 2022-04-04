package com.tcc.tenisdemesa.`object`

import com.tcc.tenisdemesa.R
import com.tcc.tenisdemesa.model.DadosEscolherTime
import com.tcc.tenisdemesa.model.DadosLiga
import com.tcc.tenisdemesa.model.DadosTime
import com.tcc.tenisdemesa.model.DadosTimesApostas

object Salvar {


    const val i: Boolean = false
    val dadosLiga1 = (
            DadosLiga(
                nome = "Commonwealth de Birmingham",
                descricao = "Os Jogos da Commonwealth reúnem as nações. O evento é realizados a 4 quatro anos.",
                data = "17 de Abril"
            )
            )
    val dadosLiga2 = (
            DadosLiga(
                nome = "TMB Platinum",
                descricao = "Este é um campeonato Brasileiro de Tênis de Mesa",
                data = "30 de março"
            )
            )
    private val time1 = (DadosTime(
        nome = "Time Amarelo",
        color = R.color.yellow
    ))
    private val time2 = (DadosTime(
        nome = "Time Azul",
        color = R.color.blue
    ))
    private val time3 = (DadosTime(
        nome = "Time Verde",
        color = R.color.green
    ))
    private val time4 = (DadosTime(
        nome = "Time Preto",
        color = R.color.black
    ))
    private var estatistica1: Float = 1.0f
    private var estatistica2: Float = 2.0f
    private var estatistica3: Float = 3.0f
    private var estatistica4: Float = 4.0f
    //timeCampeonato1 usado para jogo mais recente
    val timesCampeonato1 = (DadosTimesApostas(
        time1 = time1.nome,
        time2 = time2.nome,
        cota1 = estatistica1,
        cota2 = estatistica2,
        dataJogo = "01 abril",
        anoJogo = "2022",
        horaJogo = "Hora do Jogo: (15:00)",
        cor1 = time1.color,
        cor2 = time2.color
    ))
    private val timesCampeonato2 = (DadosTimesApostas(
        time1 = time1.nome,
        time2 = time3.nome,
        cota1 = estatistica1,
        cota2 = estatistica3,
        dataJogo = "02 abril",
        anoJogo = "2022",
        horaJogo = "Hora do Jogo: (15:00)",
        cor1 = time1.color,
        cor2 = time3.color
    ))
    private val timesCampeonato3 = (DadosTimesApostas(
        time1 = time1.nome,
        time2 = time4.nome,
        cota1 = estatistica1,
        cota2 = estatistica4,
        dataJogo = "03 abril",
        anoJogo = "2022",
        horaJogo = "Hora do Jogo: (15:00)",
        cor1 = time1.color,
        cor2 = time4.color
    ))
    private val timesCampeonato4 = (DadosTimesApostas(
        time1 = time2.nome,
        time2 = time3.nome,
        cota1 = estatistica2,
        cota2 = estatistica3,
        dataJogo = "04 abril",
        anoJogo = "2022",
        horaJogo = "Hora do Jogo: (15:00)",
        cor1 = time2.color,
        cor2 = time3.color
    ))
    private val timesCampeonato5 = (DadosTimesApostas(
        time1 = time2.nome,
        time2 = time4.nome,
        cota1 = estatistica2,
        cota2 = estatistica4,
        dataJogo = "05 abril",
        anoJogo = "2022",
        horaJogo = "Hora do Jogo: (15:00)",
        cor1 = time2.color,
        cor2 = time4.color
    ))
    private val timesCampeonato6 = (DadosTimesApostas(
        time1 = time3.nome,
        time2 = time4.nome,
        cota1 = estatistica3,
        cota2 = estatistica4,
        dataJogo = "06 abril",
        anoJogo = "2022",
        horaJogo = "Hora do Jogo: (15:00)",
        cor1 = time3.color,
        cor2 = time4.color
    ))
    private var estatistica7: Float = 1.0f
    private var estatistica8: Float = 2.0f
    private var estatistica9: Float = 3.0f
    private var estatistica10: Float = 4.0f
    private val timesCampeonato7 = (DadosTimesApostas(
        time1 = time1.nome,
        time2 = time2.nome,
        cota1 = estatistica1,
        cota2 = estatistica2,
        dataJogo = "01 Março",
        anoJogo = "2022",
        horaJogo = "Hora do Jogo: (15:00)",
        cor1 = time1.color,
        cor2 = time2.color
    ))
    private val timesCampeonato8 = (DadosTimesApostas(
        time1 = time1.nome,
        time2 = time3.nome,
        cota1 = estatistica1,
        cota2 = estatistica3,
        dataJogo = "02 Março",
        anoJogo = "2022",
        horaJogo = "Hora do Jogo: (15:00)",
        cor1 = time1.color,
        cor2 = time3.color
    ))
    private val timesCampeonato9 = (DadosTimesApostas(
        time1 = time1.nome,
        time2 = time4.nome,
        cota1 = estatistica1,
        cota2 = estatistica4,
        dataJogo = "03 Março",
        anoJogo = "2022",
        horaJogo = "Hora do Jogo: (15:00)",
        cor1 = time1.color,
        cor2 = time4.color
    ))
    private val timesCampeonato10 = (DadosTimesApostas(
        time1 = time2.nome,
        time2 = time3.nome,
        cota1 = estatistica2,
        cota2 = estatistica3,
        dataJogo = "04 Março",
        anoJogo = "2022",
        horaJogo = "Hora do Jogo: (15:00)",
        cor1 = time2.color,
        cor2 = time3.color
    ))
    private val timesCampeonato11 = (DadosTimesApostas(
        time1 = time2.nome,
        time2 = time4.nome,
        cota1 = estatistica2,
        cota2 = estatistica4,
        dataJogo = "05 Março",
        anoJogo = "2022",
        horaJogo = "Hora do Jogo: (15:00)",
        cor1 = time2.color,
        cor2 = time4.color
    ))
    private val timesCampeonato12 = (DadosTimesApostas(
        time1 = time3.nome,
        time2 = time4.nome,
        cota1 = estatistica3,
        cota2 = estatistica4,
        dataJogo = "06 Março",
        anoJogo = "2022",
        horaJogo = "Hora do Jogo: (15:00)",
        cor1 = time3.color,
        cor2 = time4.color
    ))
    var arquivosDadosLigas: MutableList<DadosLiga> = mutableListOf(dadosLiga1, dadosLiga2)
    lateinit var campeonatoSelecionado: String
    val arquivosDadosTimesApostas1: MutableList<DadosTimesApostas> = mutableListOf(
        timesCampeonato1,
        timesCampeonato2,
        timesCampeonato3,
        timesCampeonato4,
        timesCampeonato5,
        timesCampeonato6)
    val arquivosDadosTimesApostas2: MutableList<DadosTimesApostas> = mutableListOf(
        timesCampeonato7,
        timesCampeonato8,
        timesCampeonato9,
        timesCampeonato10,
        timesCampeonato11,
        timesCampeonato12
    )
    lateinit var escolhaTimeAposta: DadosEscolherTime

}
