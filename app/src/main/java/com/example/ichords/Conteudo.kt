package com.example.ichords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ichords.Adapter.AdapterConteudo
import com.example.ichords.model.item

class Conteudo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conteudo)

        val recyclerView_conteudo = findViewById<RecyclerView>(R.id.recycleView_conteudo)
        recyclerView_conteudo.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView_conteudo.setHasFixedSize(true)
        //configurar o adapter
        val listaConteudos: MutableList<item> = mutableListOf()
        val adapterConteudo = AdapterConteudo(this,  listaConteudos)
        recyclerView_conteudo.adapter = adapterConteudo
        //Oi
        val conteudo1 = item(
            R.drawable.logotrilha,
            "Introdução ao Violão"
        )
        listaConteudos.add(conteudo1)

        val conteudo2 = item(
            R.drawable.logotrilha,
            "Coodenação Motora"
        )
        listaConteudos.add(conteudo2)

        val conteudo3 = item(
            R.drawable.logotrilha,
            "Leitura de Sifras e Acordes"
        )
        listaConteudos.add(conteudo3)

        val conteudo4 = item(
            R.drawable.logotrilha,
            "Teoria Musical Básica"
        )
        listaConteudos.add(conteudo4)

        val conteudo5 = item(
            R.drawable.logotrilha,
            "Técnica de Dedilhado"
        )
        listaConteudos.add(conteudo5)

        val conteudo6 = item(
            R.drawable.logotrilha,
            "Partitura e Tablaturas"
        )
        listaConteudos.add(conteudo6)

        val conteudo7 = item(
            R.drawable.logotrilha,
            "Pastanas (Barré)"
        )
        listaConteudos.add(conteudo7)

        val conteudo8 = item(
            R.drawable.logotrilha,
            "Ritmo e Batidas"
        )
        listaConteudos.add(conteudo8)

        val conteudo9 = item(
            R.drawable.logotrilha,
            "Enriquecimento de Som"
        )
        listaConteudos.add(conteudo9)

        val conteudo10 = item(
            R.drawable.logotrilha,
            "Motivação e Pratica"
        )
        listaConteudos.add(conteudo10)

    }
}