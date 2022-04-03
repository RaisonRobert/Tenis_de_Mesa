package com.tcc.tenisdemesa.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tcc.tenisdemesa.R
import com.tcc.tenisdemesa.`object`.Salvar
import com.tcc.tenisdemesa.model.DadosLiga
import com.tcc.tenisdemesa.model.DadosTimesApostas
import kotlinx.android.synthetic.main.item_fragment_lista_de_ligas.view.*
import kotlinx.android.synthetic.main.item_fragment_lista_times_apostas.view.*
import kotlinx.android.synthetic.main.item_fragment_lista_times_apostas.view.textViewData

class RecyclerViewTimesApostasAdapter(var clickListener: itemClickListener) :
    RecyclerView.Adapter<RecyclerViewTimesApostasAdapter.ViewHolder>()  {
    private var listar: MutableList<DadosTimesApostas> = mutableListOf()
    var itemListener: itemClickListener? = null

    interface itemClickListener {
        fun itemClick(dado: DadosTimesApostas, position: Int)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("ResourceAsColor", "SetTextI18n")
        fun bindView(listAdapter: DadosTimesApostas, action: itemClickListener) {
            itemView.textViewTime1.text = listAdapter.time1.toString()
            itemView.textViewTime2.text = listAdapter.time2.toString()
            itemView.textViewCota1.text = listAdapter.cota1.toString()
            itemView.textViewCota2.text = listAdapter.cota2.toString()
            itemView.textViewData.text = listAdapter.dataJogo.toString()
            itemView.textViewAno.text = listAdapter.anoJogo.toString()
            itemView.textViewHora.text = listAdapter.horaJogo.toString()
            itemView.imageButtonTime1.setBackgroundResource(listAdapter.cor1)
            itemView.imageButtonTime2.setBackgroundResource(listAdapter.cor2)
            itemView.textViewCampeonado.text = Salvar.campeonatoSelecionado
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_fragment_lista_times_apostas, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listr = listar[position]
        holder.bindView(listr, clickListener)
        holder.let {
            itemListener?.itemClick(listar[position], position)
        }
    }

    override fun getItemCount(): Int {
        return listar.size
    }

    @SuppressLint("NotifyDataSetChanged")
    public fun popularLista(dado: MutableList<DadosTimesApostas>) {
        this.listar.clear()
        this.listar.addAll(dado)
        Log.i("teste", "lista ---- >> $listar")
        notifyDataSetChanged()
    }

}