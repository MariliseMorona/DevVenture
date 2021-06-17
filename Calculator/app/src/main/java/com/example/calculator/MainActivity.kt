package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_one.setOnClickListener

    }

    override fun insertValue(string: String, clearData: Boolean){
        if(txt_results.text.isNotEmpty()){
            expressao.text = ""
        }
        if(clearData){
            txt_results = ""
            expressao.append(string)
        }else{
            expressao.append(txt_results.text)
            expressao.append(string)
            txt_results.text = ""
        }
    }

}