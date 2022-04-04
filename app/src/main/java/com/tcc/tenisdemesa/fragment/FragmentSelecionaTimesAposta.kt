package com.tcc.tenisdemesa.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tcc.tenisdemesa.R
import com.tcc.tenisdemesa.`object`.Salvar
import kotlinx.android.synthetic.main.layout_fragment_home.view.*
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

    }

    private fun addDados(view: View) {
        view.textViewTimeA.text = Salvar.escolhaTimeAposta.timeA.toString()
        view.textViewTimeB.text = Salvar.escolhaTimeAposta.timeB.toString()
        view.imageButtonTIMEA.setBackgroundResource(Salvar.escolhaTimeAposta.cor1)
        view.imageButtonTIMEB.setBackgroundResource(Salvar.escolhaTimeAposta.cor2)
    }
}