package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class RelatorioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relatorio)

        val nomeTextView = findViewById<TextView>(R.id.nome)
        val pesoTextView = findViewById<TextView>(R.id.peso)
        val alturaTextView = findViewById<TextView>(R.id.altura)
        val statusTextView = findViewById<TextView>(R.id.status)

        val intent: Intent = getIntent()
        nomeTextView.text =intent.getStringExtra("nome")
        pesoTextView.text =intent.getStringExtra("peso")
        alturaTextView.text =intent.getStringExtra("altura")
        statusTextView.text =intent.getStringExtra("status")
    }
}