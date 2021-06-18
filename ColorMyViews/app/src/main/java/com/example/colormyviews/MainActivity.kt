package com.example.colormyviews

import android.content.Context
import android.content.SharedPreferences
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var oneBox : TextView
    private lateinit var twoBox : TextView
    private lateinit var threeBox : TextView
    private lateinit var fourBox : TextView
    private lateinit var fiveBox : TextView

    private var oneBoxColor = 0
    private var twoBoxColor = 0
    private var threeBoxColor = 0
    private var fourBoxColor = 0
    private var fiveBoxColor = 0

    private val sharedPreferences : SharedPreferences
    get(){
        return this.getSharedPreferences("colors", Context.MODE_PRIVATE)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        oneBox = findViewById(R.id.box_one_text)
        twoBox = findViewById(R.id.box_two_text)
        threeBox = findViewById(R.id.box_three_text)
        fourBox = findViewById(R.id.box_four_text)
        fiveBox = findViewById(R.id.box_five_text)

        oneBoxColor = sharedPreferences.getInt("oneBox", R.color.grey)
        oneBox.setBackgroundResource(oneBoxColor)
        twoBoxColor = sharedPreferences.getInt("twoBox", R.color.grey)
        twoBox.setBackgroundResource(twoBoxColor)
        threeBoxColor = sharedPreferences.getInt("threeBox", R.color.grey)
        threeBox.setBackgroundResource(threeBoxColor)
        fourBoxColor = sharedPreferences.getInt("fourBox", R.color.grey)
        fourBox.setBackgroundResource(fourBoxColor)
        fiveBoxColor = sharedPreferences.getInt("fiveBox", R.color.grey)
        fiveBox.setBackgroundResource(fiveBoxColor)


        var changeColor = R.color.grey
        val red = findViewById<Button>(R.id.btn_red)
        val green = findViewById<Button>(R.id.btn_green)
        val yellow = findViewById<Button>(R.id.btn_yellow)



        green.setOnClickListener{
            changeColor = R.color.green
        }
        yellow.setOnClickListener{
            changeColor = R.color.yellow
        }
        red.setOnClickListener{
            changeColor = R.color.red
        }
        oneBox.setOnClickListener{
            oneBox.setBackgroundResource(changeColor)
            oneBoxColor = changeColor
        }
        twoBox.setOnClickListener{
            twoBox.setBackgroundResource(changeColor)
            twoBoxColor = changeColor
        }
        threeBox.setOnClickListener{
            threeBox.setBackgroundResource(changeColor)
            threeBoxColor = changeColor
        }
        fourBox.setOnClickListener{
            fourBox.setBackgroundResource(changeColor)
            fourBoxColor = changeColor
        }
        fiveBox.setOnClickListener{
            fiveBox.setBackgroundResource(changeColor)
            fiveBoxColor = changeColor
        }
    }

    override fun onStop() {
        super.onStop()


        val editor = sharedPreferences.edit()

        editor.putInt("oneBox", oneBoxColor)
        editor.putInt("twoBox", twoBoxColor)
        editor.putInt("threeBox", threeBoxColor)
        editor.putInt("fourBox", fourBoxColor)
        editor.putInt("fiveBox", fiveBoxColor)


    }
}