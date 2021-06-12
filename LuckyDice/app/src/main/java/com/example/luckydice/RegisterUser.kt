package com.example.luckydice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

    val playerName = findViewById<EditText>(R.id.edt_name)
        val btnInsertName = findViewById<Button>(R.id.btn_insertname)

        btnInsertName.setOnClickListener{
            val player = playerName.text.toString()
            //Intent => navegação entre Acivities com
            //transmissão da informação nome inputado
            //pelo usuário
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("playerName", player)

            startActivity(intent)
        }
    }
}