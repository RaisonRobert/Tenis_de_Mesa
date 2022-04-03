package com.tcc.tenisdemesa.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tcc.tenisdemesa.R
import com.tcc.tenisdemesa.`object`.Salvar
import com.tcc.tenisdemesa.adapter.RecyclerViewLigasAdapter
import com.tcc.tenisdemesa.model.DadosLiga

class FragmentLigas : Fragment(), RecyclerViewLigasAdapter.itemClickListener {
    private lateinit var recycler_lista: RecyclerView
    private lateinit var adapterLista: RecyclerViewLigasAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.layout_fragment_lista_de_ligas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.title = "Lista de Ligas"
        adapterLista = RecyclerViewLigasAdapter(this)
        setupRecyclerView(view)
        addDados()
    }

    private fun addDados() {
        adapterLista.popularLista(Salvar.arquivosDadosLigas)
    }

    private fun setupRecyclerView(view: View) {
//        Log.i("teste", "lista ---- >> ${Salvar.arquivosDadosLigas}")
        recycler_lista = view.findViewById<RecyclerView>(R.id.lista_recyclerViewLigas)
        recycler_lista.layoutManager = LinearLayoutManager(requireContext())
        recycler_lista.adapter = adapterLista
        adapterLista.apply {
            itemListener = object :
                RecyclerViewLigasAdapter.itemClickListener{
                override fun itemClick(dado: DadosLiga, position: Int) {

                }
                }
        }

    }

    override fun itemClick(dado: DadosLiga, position: Int) {
//        val action = .confirmationAction(amount)
//        v.findNavController().navigate(action)
        Salvar.campeonatoSelecionado = dado.nome
        findNavController().navigate(R.id.action_listadeLigas_to_listaTimesApostas)
    }
}