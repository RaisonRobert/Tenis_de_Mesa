package com.tcc.tenisdemesa.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tcc.tenisdemesa.R
import com.tcc.tenisdemesa.fragment.FragmentLigas
import com.tcc.tenisdemesa.fragment.FragmentTimesApostas
import com.tcc.tenisdemesa.model.DadosLiga
import kotlinx.android.synthetic.main.item_fragment_lista_de_ligas.view.*

class RecyclerViewLigasAdapter(var clickListener: FragmentLigas) :
    RecyclerView.Adapter<RecyclerViewLigasAdapter.ViewHolder>() {
    private var listar: MutableList<DadosLiga> = mutableListOf()
    var itemListener: itemClickListener? = null

    interface itemClickListener {
        fun itemClick(dado: DadosLiga, position: Int)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("SetTextI18n")
        fun bindView(listAdapter: DadosLiga, action: itemClickListener) {
            itemView.textViewNome.text = listAdapter.nome.toString()
            itemView.textViewData.text = listAdapter.data.toString()
            itemView.textViewDescricao.text = listAdapter.descricao.toString()
            itemView.setOnClickListener{
                action.itemClick(listAdapter, adapterPosition)

            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): RecyclerViewLigasAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_fragment_lista_de_ligas, parent, false)
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
    public fun popularLista(dado: MutableList<DadosLiga>) {
        this.listar.clear()
        this.listar.addAll(dado)
        Log.i("teste", "lista ---- >> ${listar}")
        notifyDataSetChanged()
    }
}


