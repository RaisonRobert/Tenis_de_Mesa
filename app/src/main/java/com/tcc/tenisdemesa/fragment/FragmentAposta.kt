package com.tcc.tenisdemesa.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tcc.tenisdemesa.R
import com.tcc.tenisdemesa.`object`.Salvar
import kotlinx.android.synthetic.main.dialog_confirmacao_aposta.view.*
import kotlinx.android.synthetic.main.layout_fragment_aposta.view.*

class FragmentAposta : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.layout_fragment_aposta, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.title = "Faça sua Aposta"
        setDados(view)
        botoes(view)
    }

    private fun botoes(view: View) {
//        if (TextUtils.isEmpty(editTextTextPersonName.text)) {
//            editTextTextPersonName.error = "Nome Obrigatório"
//            editTextTextPersonName.requestFocus()
//            return false
//        }
        view.abuttonConfirmar.setOnClickListener {
        if(view.aeditTextValorAposta.text.isEmpty()) {
            view.aeditTextValorAposta.error = "Digite Sua Aposta"
            view.aeditTextValorAposta.requestFocus()
        }else {
                dialogAlerta()
            }
        }
    }

    private fun dialogAlerta() {
        val alertDialogExibir = AlertDialog.Builder(requireContext())
        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.dialog_confirmacao_aposta, null)
        alertDialogExibir.setView(view)
        val dialog = alertDialogExibir.create()
        dialog.show()
        dialog.setCancelable(false)
        view.btn_sim.setOnClickListener{
            dialogConfirmacao()
            dialog.setCancelable(true)
            dialog.dismiss()
            findNavController().navigate(R.id.action_aposta_to_home)
            val navController = findNavController()
            navController.popBackStack(R.id.home, false)
        }
        view.btn_nao.setOnClickListener{
            dialog.setCancelable(true)
            dialog.dismiss()
        }
    }

    private fun dialogConfirmacao() {
        val alertDialogExibir = AlertDialog.Builder(requireContext())
        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.dialog_confirmacao_dados, null)
        alertDialogExibir.setView(view)
        val dialog = alertDialogExibir.create()
        dialog.show()
    }

    private fun setDados(view: View) {
        view.atextViewTime1.text = Salvar.apostaCard.time1.toString()
        view.atextViewTime2.text = Salvar.apostaCard.time2.toString()
        view.atextViewCota1.text = Salvar.apostaCard.cota1.toString()
        view.atextViewCota2.text = Salvar.apostaCard.cota2.toString()
        view.atextViewData.text = Salvar.apostaCard.dataJogo.toString()
        view.atextViewAno.text = Salvar.apostaCard.anoJogo.toString()
        view.atextViewHora.text = Salvar.apostaCard.horaJogo.toString()
        view.aimageButtonTime1.setBackgroundResource(Salvar.apostaCard.cor1)
        view.aimageButtonTime2.setBackgroundResource(Salvar.apostaCard.cor2)
        view.aimageButton.setBackgroundResource(Salvar.aposta.corSelecionada)
        view.anomeTimeAposta.text = Salvar.aposta.timeSelecionado.toString()
        view.atextViewCotaAposta.text = Salvar.aposta.cotaSelecionada.toString()
        view.atextViewCampeonado.text = Salvar.aposta.nomeCampeonato.toString()
//        val valor: Float = aeditTextValorAposta.text.toString().toFloat() * Salvar.aposta.cotaSelecionada
//        view.atextViewValorTotal.text = "R$: "
    }
}