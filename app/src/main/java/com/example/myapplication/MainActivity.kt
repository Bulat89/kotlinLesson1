package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = TwoPropertyDataClass("sfa",33).St.toString()

        findViewById<Button>(R.id.button_x).setOnClickListener {
            println("$data")
        }

    }











}