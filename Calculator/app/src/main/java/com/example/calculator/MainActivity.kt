/*
package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val zero = findViewById<Button>(R.id.btn_zero)
    val one = findViewById<Button>(R.id.btn_one)
    val two = findViewById<Button>(R.id.btn_two)
    val three = findViewById<Button>(R.id.btn_three)
    val four = findViewById<Button>(R.id.btn_four)
    val five = findViewById<Button>(R.id.btn_five)
    val six = findViewById<Button>(R.id.btn_six)
    val seven = findViewById<Button>(R.id.btn_seven)
    val eight = findViewById<Button>(R.id.btn_eight)
    val nine = findViewById<Button>(R.id.btn_nine)
    val sum = findViewById<Button>(R.id.btn_sum)
    val subtraction = findViewById<Button>(R.id.btn_subtraction)
    val multiplication = findViewById<Button>(R.id.btn_multiplication)
    val division = findViewById<Button>(R.id.btn_division)
    val equals = findViewById<Button>(R.id.btn_equals)
    val results = findViewById<TextView>(R.id.txt_results)

    val btnClick = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        zero.setOnClickListener{ insertValue(value = "0")}
        one.setOnClickListener{ insertValue(value = "1")}
        two.setOnClickListener{ insertValue(value = "2")}
        three.setOnClickListener{ insertValue(value = "3")}
        four.setOnClickListener{ insertValue(value = "4")}
        five.setOnClickListener{ insertValue(value = "5")}
        six.setOnClickListener{ insertValue(value = "6")}
        seven.setOnClickListener{ insertValue(value = "7")}
        eight.setOnClickListener{ insertValue(value = "8")}
        nine.setOnClickListener{ insertValue(value = "9")}
        sum.setOnClickListener{ insertValue(value = "+")}
        subtraction.setOnClickListener{ insertValue(value = "-")}
        division.setOnClickListener{ insertValue(value = "*")}
        multiplication.setOnClickListener{ insertValue(value = "/")}
        equals.setOnClickListener{ insertValue(value = " ")}

    }

    override fun insertValue(value: String) {
        if(btnClick){
            results.text.setText(" ")
        }
    }
}*/