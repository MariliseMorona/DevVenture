package com.example.luckydice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado01 = findViewById<TextView>(R.id.txt_dado01)
        val dado02 = findViewById<TextView>(R.id.txt_dado02)
        val btn = findViewById<Button>(R.id.btn_jogar)

        btn.setOnClickListener{
            dado01.text = geraAleatorio().toString()
            dado02.text = geraAleatorio().toString()
        }

    }

    private fun geraAleatorio(): Int{
        return (1..6).random()
    }
}