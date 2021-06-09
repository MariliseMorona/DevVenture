package com.example.luckydice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado01 = findViewById<ImageView>(R.id.mgv_dado01)
        val dado02 = findViewById<ImageView>(R.id.mgv_dado02)
        val btn = findViewById<Button>(R.id.btn_jogar)

        val images = listOf(
            R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3,
            R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6)

        btn.setOnClickListener{
            dado01.setImageResource(images.get(geraAleatorio()))
            dado02.setImageResource(images.get(geraAleatorio()))

            //OR
            //dado01.setImageResource(images[geraAleatorio()-1])
            //dado02.setImageResource(images[geraAleatorio()-1])

            //Ou, não precisando usar a função geraAleatorio
            //dado01.setImageResource(images.random())
            //dado02.setImageResource(images.random())
        }

    }

    private fun geraAleatorio(): Int{
        return (0..5).random()
    }
}