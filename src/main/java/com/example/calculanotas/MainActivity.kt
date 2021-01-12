package com.example.calculanotas

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener{
            val nota1 = Integer.parseInt(txtN1.text.toString())
            val nota2 = Integer.parseInt(txtN2.text.toString())
            val faltas = Integer.parseInt(txtFaltas.text.toString())

            val media = (nota1 + nota2) / 2

            if (media >= 6 && faltas <= 10){
                resultado.setText("Aluno Aprovado \n " +
                        "média: $media \n Faltas: $faltas")
                resultado.setTextColor(Color.GREEN)
            } else {
                resultado.setText("Aluno reprovado \n " +
                        " média: $media \n Fatas: $faltas")
                resultado.setTextColor(Color.RED)
            }



        }




    }
}