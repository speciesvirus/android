package com.spw.plai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mClickButton1: Button = findViewById<View>(R.id.b1) as Button
        mClickButton1.setOnClickListener { x ->
            onClick()
        }
    }

    fun onClick() {
        val text = "Hello toast!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
}