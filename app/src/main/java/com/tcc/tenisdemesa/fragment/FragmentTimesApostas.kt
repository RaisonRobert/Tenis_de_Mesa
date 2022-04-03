package com.tcc.tenisdemesa.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tcc.tenisdemesa.R
import com.tcc.tenisdemesa.`object`.Salvar
import com.tcc.tenisdemesa.adapter.RecyclerViewLigasAdapter
import com.tcc.tenisdemesa.adapter.RecyclerViewTimesApostasAdapter
import com.tcc.tenisdemesa.model.DadosLiga
import com.tcc.tenisdemesa.model.DadosTimesApostas

class FragmentTimesApostas: Fragment(), RecyclerViewTimesApostasAdapter.itemClickListener {
    private lateinit var recycler_lista: RecyclerView
    private lateinit var adapterLista: RecyclerViewTimesApostasAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.layout_fragment_lista_times_apostas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.title = "Lista de Jogos"
        adapterLista = RecyclerViewTimesApostasAdapter(this)
        setupRecyclerView(view)
        addDados()
    }
    private fun addDados() {
        if (Salvar.campeonatoSelecionado == Salvar.dadosLiga1.nome) {
            adapterLista.popularLista(Salvar.arquivosDadosTimesApostas1)
        }else adapterLista.popularLista(Salvar.arquivosDadosTimesApostas2)
    }

    private fun setupRecyclerView(view: View) {
//        Log.i("teste", "lista ---- >> ${Salvar.arquivosDadosLigas}")
        recycler_lista = view.findViewById<RecyclerView>(R.id.lista_recyclerViewTimesApostas)
        recycler_lista.layoutManager = LinearLayoutManager(requireContext())
        recycler_lista.adapter = adapterLista
        adapterLista.apply {
            itemListener = object :
                RecyclerViewTimesApostasAdapter.itemClickListener{
                override fun itemClick(dado: DadosTimesApostas, position: Int) {

                }
            }
        }

    }

    override fun itemClick(dado: DadosTimesApostas, position: Int) {
        TODO("Not yet implemented")
    }
}