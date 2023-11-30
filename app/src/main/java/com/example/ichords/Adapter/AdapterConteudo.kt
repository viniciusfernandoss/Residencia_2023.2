package com.example.ichords.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ichords.R
import com.example.ichords.model.item

class AdapterConteudo(private val context: Context, private val conteudos: MutableList<item>): RecyclerView.Adapter<AdapterConteudo.ConteudoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConteudoViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.conteudo_item, parent, false)
        val holder = ConteudoViewHolder(itemLista)
        return holder
    }

    override fun getItemCount(): Int = conteudos.size

    override fun onBindViewHolder(holder: ConteudoViewHolder, position: Int) {
        holder.image.setImageResource(conteudos[position].imagem)
        holder.titulo.text = conteudos[position].titulo
    }

    inner class ConteudoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val image = itemView.findViewById<ImageView>(R.id.img_ModuloConteudo)
            val titulo = itemView.findViewById<TextView>(R.id.txt_TituloConteudo)
    }

}