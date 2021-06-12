package com.example.luckydice

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.luckydice.databinding.FragmentRegisterUserBinding

class RegisterUserFragment : Fragment() {
    private var binding: FragmentRegisterUserBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterUserBinding.inflate(inflater, container, false)

        val playerName = binding?.edtName
        val btnInsertName = binding?.btnInsertname

        btnInsertName?.setOnClickListener{
            val player = playerName?.text.toString()
            //Intent => navegação entre Acivities com
            //transmissão da informação nome inputado
            //pelo usuário



            /*btnInsertName.setOnClickListener{
                val player = playerName?.text.toString()
                //Intent => navegação entre Acivities com
                //transmissão da informação nome inputado
                //pelo usuário
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("playerName", player)*/


        }
        return binding?.root
    }


}