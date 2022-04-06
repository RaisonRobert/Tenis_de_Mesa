package com.tcc.tenisdemesa.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tcc.tenisdemesa.R
import com.tcc.tenisdemesa.`object`.Salvar
import com.tcc.tenisdemesa.model.DadosAposta
import kotlinx.android.synthetic.main.layout_fragment_seleciona_times_aposta.view.*


class FragmentSelecionaTimesAposta : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.layout_fragment_seleciona_times_aposta, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.title = "Escolha o Time"
        addDados(view)
        botoes(view)
    }

    private fun botoes(view: View) {
        view.imageButtonTIMEA.setOnClickListener {
            val selecionado = (DadosAposta(
                timeSelecionado = Salvar.escolhaTimeAposta.timeA,
                corSelecionada = Salvar.escolhaTimeAposta.cor1,
                cotaSelecionada = Salvar.escolhaTimeAposta.cotaA,
                nomeCampeonato = Salvar.campeonatoSelecionado
            ))
            Salvar.aposta = selecionado
//            Log.i("teste", "${Salvar.aposta}")
            findNavController().navigate(R.id.action_escolhaTimeAposta_to_aposta)
        }
        view.imageButtonTIMEB.setOnClickListener {
            val selecionado = (DadosAposta(
                timeSelecionado = Salvar.escolhaTimeAposta.timeB,
                corSelecionada = Salvar.escolhaTimeAposta.cor2,
                cotaSelecionada = Salvar.escolhaTimeAposta.cotaB,
                nomeCampeonato = Salvar.campeonatoSelecionado
            ))
            Salvar.aposta = selecionado
            findNavController().navigate(R.id.action_escolhaTimeAposta_to_aposta)
        }
    }

    private fun addDados(view: View) {
        view.textViewTimeA.text = Salvar.escolhaTimeAposta.timeA.toString()
        view.textViewTimeB.text = Salvar.escolhaTimeAposta.timeB.toString()
        view.imageButtonTIMEA.setBackgroundResource(Salvar.escolhaTimeAposta.cor1)
        view.imageButtonTIMEB.setBackgroundResource(Salvar.escolhaTimeAposta.cor2)
    }
}