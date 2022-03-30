package com.tcc.tenisdemesa.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tcc.tenisdemesa.R
import kotlinx.android.synthetic.main.layout_fragment_bem_vindo.view.*

class FragmentBemVindo : Fragment() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.layout_fragment_bem_vindo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTextInicial(view)
    }

    //    @SuppressLint("SetTextI18n")
    private fun setTextInicial(view: View) {
        view.textViewTitulo.text= "Bem Vindo\n ao \nTennis Stats"
        view.textViewSubtitulo.text = "Boa Noite"
        view.textViewSaudacao.text = "Seja bem vindo"
        view.textViewFrase.text ="Somos a maior liga de aposta do norte do Amazonas"
    }
}