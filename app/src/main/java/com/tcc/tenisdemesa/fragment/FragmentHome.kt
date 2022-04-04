package com.tcc.tenisdemesa.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tcc.tenisdemesa.R
import com.tcc.tenisdemesa.`object`.Salvar
import com.tcc.tenisdemesa.model.DadosEscolherTime
import kotlinx.android.synthetic.main.layout_fragment_home.*
import kotlinx.android.synthetic.main.layout_fragment_home.view.*

class FragmentHome : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.layout_fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.title = "Tennis Stats"
        btn_veraposta.isEnabled = false
        proximaPartida(view)
        botoes(view)


    }

    private fun proximaPartida(view: View) {
        view.ptextViewTime1.text = Salvar.timesCampeonato1.time1.toString()
        view.ptextViewTime2.text = Salvar.timesCampeonato1.time2.toString()
        view.ptextViewCota1.text = Salvar.timesCampeonato1.cota1.toString()
        view.ptextViewCota2.text = Salvar.timesCampeonato1.cota2.toString()
        view.ptextViewData.text = Salvar.timesCampeonato1.dataJogo.toString()
        view.ptextViewAno.text = Salvar.timesCampeonato1.anoJogo.toString()
        view.ptextViewHora.text = Salvar.timesCampeonato1.horaJogo.toString()
        view.pimageButtonTime1.setBackgroundResource(Salvar.timesCampeonato1.cor1)
        view.pimageButtonTime2.setBackgroundResource(Salvar.timesCampeonato1.cor2)
        view.ptextViewCampeonado.text = Salvar.dadosLiga1.nome
    }

    private fun botoes(view: View) {
        view.pbtnApostar.setOnClickListener {
//            direto para tela de aposta
            val escolha = (DadosEscolherTime(
                timeA = Salvar.timesCampeonato1.time1.toString(),
                timeB = Salvar.timesCampeonato1.time2.toString(),
                cor1 = Salvar.timesCampeonato1.cor1,
                cor2 = Salvar.timesCampeonato1.cor2
            ))
            Salvar.escolhaTimeAposta = escolha
            findNavController().navigate(R.id.action_home_to_escolhaTimeAposta)
        }
//        chama o Fragment das ligas
        view.btn_liga.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_listadeLigas)
        }
//        chama o Fragment escolher o times para aposta
        if (Salvar.i) {
            btn_veraposta.isEnabled = true
            view.btn_veraposta.setOnClickListener {
//                view.btn_veraposta.setBackgroundResource(R.color.black)
            }
        }
    }
}