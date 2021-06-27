package com.example.luckydice

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.luckydice.databinding.FragmentThrowDiceBinding


class ThrowDiceFragment : Fragment() {
    private var binding: FragmentThrowDiceBinding? = null

    @SuppressLint("QueryPermissionsNeeded")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentThrowDiceBinding.inflate(inflater, container, false)

        val dado01 = binding?.mgvDado01
        val dado02 = binding?.mgvDado02
        val btn = binding?.btnJogar
        val text = binding?.txtDescription
        val btnShare = binding?.btnShare


        text?.text = arguments?.getString("playerName")

        val images = listOf(
            R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3,
            R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6
        )

        btn?.setOnClickListener {
            dado01?.setImageResource(images.get(geraAleatorio()))
            dado02?.setImageResource(images.get(geraAleatorio()))
        }
        btnShare?.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(
                Intent.EXTRA_TEXT,
                "O jogador tirou o número: $dado01 + $dado02"
            )
            intent.setPackage("com.whatsapp")
            intent.type = "text/plain"

            activity?.packageManager?.run {
                if (intent.resolveActivity(this) != null) {
                    startActivity(intent)
                } else {
                    Toast.makeText(
                        context,
                        "Você não possui o aplicativo instalado !",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
        return binding?.root
    }
        private fun geraAleatorio(): Int {
            return (0..5).random()
        }

    }



