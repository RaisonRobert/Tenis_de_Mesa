package com.tcc.tenisdemesa.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tcc.tenisdemesa.R
import com.tcc.tenisdemesa.`object`.Salvar
import com.tcc.tenisdemesa.adapter.RecyclerViewTimesApostasAdapter
import com.tcc.tenisdemesa.model.DadosApostaCard
import com.tcc.tenisdemesa.model.DadosEscolherTime
import com.tcc.tenisdemesa.model.DadosTimesApostas

class FragmentTimesApostas : Fragment(), RecyclerViewTimesApostasAdapter.itemClickListener {
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
        } else adapterLista.popularLista(Salvar.arquivosDadosTimesApostas2)
    }

    private fun setupRecyclerView(view: View) {
//        Log.i("teste", "lista ---- >> ${Salvar.arquivosDadosLigas}")
        recycler_lista = view.findViewById<RecyclerView>(R.id.lista_recyclerViewTimesApostas)
        recycler_lista.layoutManager = LinearLayoutManager(requireContext())
        recycler_lista.adapter = adapterLista
        adapterLista.apply {
            itemListener = object :
                RecyclerViewTimesApostasAdapter.itemClickListener {
                override fun itemClick(dado: DadosTimesApostas, btnApostar: Button, position: Int) {
                    btnApostar.setOnClickListener {
                        val escolha = (DadosEscolherTime(
                            timeA = dado.time1,
                            timeB = dado.time2,
                            cotaA = dado.cota1,
                            cotaB = dado.cota2,
                            cor1 = dado.cor1,
                            cor2 = dado.cor2
                        ))
                        Salvar.escolhaTimeAposta = escolha
                        val apostaCards = (DadosApostaCard(
                            time1 = dado.time1,
                            time2 = dado.time2,
                            cota1 = dado.cota1,
                            cota2 = dado.cota2,
                            dataJogo = dado.dataJogo,
                            anoJogo = dado.anoJogo,
                            horaJogo = dado.horaJogo,
                            cor1 = dado.cor1,
                            cor2 = dado.cor2
                        ))
                        Salvar.apostaCard = apostaCards
                        findNavController().navigate(R.id.action_listaTimesApostas_to_escolhaTimeAposta)
                    }
                }
            }
        }

    }

    override fun itemClick(dado: DadosTimesApostas, btnApostar: Button, position: Int) {
        TODO("Not yet implemented")
    }
}