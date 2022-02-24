package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)
        val sair = findViewById<Button>(R.id.sair)




        calcular.setOnClickListener {
            val txtPeso = findViewById<EditText>(R.id.txtPeso).text.toString().toDouble()
            val txtAltura = findViewById<EditText>(R.id.txtAltura).text.toString().toDouble()
            val txtStatus = findViewById<TextView>(R.id.txtStatus)
            val txtNome = findViewById<TextView>(R.id.txtNome)
            var statusImc = ""

            val calculoImc = (txtPeso /(txtAltura * txtAltura))



            if (calculoImc < 18.5){
                 statusImc = "Abaixo do Peso"
            }else if (calculoImc < 24.9){
                 statusImc = "Peso Ideal (Parabéns)"
            }else if (calculoImc < 29.9 ){
                 statusImc = "Levemente acima do peso"
            }else if (calculoImc < 34.9){
                 statusImc = "Obesidade grau |"
            }else if(calculoImc < 39.9){
                 statusImc = "Obesidade grau || (severa)"
            }else{
                 statusImc = "Obesidade grau ||| (mórbida) Cuidado!!!"
            }

            val intent = Intent(this, RelatorioActivity::class.java)

            intent.putExtra("nome", txtNome.text.toString())
            intent.putExtra("peso", txtPeso.toString())
            intent.putExtra("altura", txtAltura.toString())
            intent.putExtra("status", statusImc)

            startActivity(intent)

        }

        sair.setOnClickListener {
            finish()
        }
    }
}