package com.example.colormyviews.view

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import androidx.annotation.NonNull
import androidx.appcompat.widget.AppCompatButton
import butterknife.OnClick
import com.example.colormyviews.R
import com.example.colormyviews.R.*
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Array.get

class MainActivity() : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        var binding: MainActivity? = null
        var btnScreen = findViewById<FloatingActionButton>(R.id.fbt_screenShot)
        var colorDefault = color.grey
        lateinit var sharedPreferences: SharedPreferences
        getSharedPreferences("colors", Context.MODE_PRIVATE)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        @SuppressLint("ResourceAsColor")
            fun onClick(view: View) {
                val changeColor = when (view.id) {
                    id.btn_red -> color.red
                    id.btn_yellow -> color.yellow
                    id.btn_green -> color.green
                    else -> colorDefault
                }

                fun changeBackground() {
                    listOf(
                        id.box_one_text, id.box_two_text,
                        id.box_three_text, id.box_four_text, id.box_five_text
                    )
                }
                for (item in listOf(Int)) {
                    view.setBackgroundResource(changeColor)
                    sharedPreferences.edit()
                        .putInt("colors", changeColor)
                        .apply()
                }
            }


            btnScreen?.setOnClickListener {
                fun getBitmapFromView(view: View): Bitmap? {
                    var bitmap = Bitmap
                        .createBitmap(view.width, view.height, Bitmap.Config.ARGB_8888)
                    var canvas = Canvas(bitmap)
                    view.draw(canvas)
                    return bitmap
                }

            }
        }
    }

