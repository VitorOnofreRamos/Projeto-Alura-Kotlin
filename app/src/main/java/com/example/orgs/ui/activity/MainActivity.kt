package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val nome = findViewById<TextView>(R.id.nome)
        nome.text = "Cesta de frutas"
        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.text = "Uva, Banana, Abacaxi"
        val valor = findViewById<TextView>(R.id.valor)
        valor.text = "20.50"*/
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(nome = "teste",
                descricao = "teste desc",
                valor = BigDecimal("19.00")
            ),
            Produto(nome = "teste1",
                descricao = "teste desc",
                valor = BigDecimal("19.00")
            ),
            Produto(nome = "teste2",
                descricao = "teste desc",
                valor = BigDecimal("30.00")
            ),
            Produto(nome = "teste3",
                descricao = "teste desc",
                valor = BigDecimal("19.00")
            )
        ))
        //recyclerView.layoutManager = LinearLayoutManager(this)
    }
}