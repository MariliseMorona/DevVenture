package com.example.luckydice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Os logs estão presentes no código para aprendizado
        //de ciclo de vida da activity

        /*Log.i("Ciclo de vida", "On Create")
    }


    override fun onStart() {
        super.onStart()
        Log.i("Ciclo de Vida", "On start")

    }

    override fun onResume() {
        super.onResume()
        Log.i("Ciclo de Vida", "On Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclo de Vida", "On Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclo de Vida", "On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclo de Vida", "On Destroy")
    }*/

}
}