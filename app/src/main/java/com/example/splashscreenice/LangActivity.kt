package com.example.splashscreenice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LangActivity : AppCompatActivity() {

    // declare variables
    private lateinit var textInfo: TextView
    private lateinit var engBtn: Button
    private lateinit var itlBtn: Button
    private lateinit var frBtn: Button
    private lateinit var spBtn: Button
    private lateinit var dutchBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lang)

        // initialize buttons
        textInfo = findViewById(R.id.textView)
        engBtn = findViewById(R.id.button)
        itlBtn = findViewById(R.id.button2)
        frBtn = findViewById(R.id.button3)
        spBtn = findViewById(R.id.button4)
        dutchBtn = findViewById(R.id.button5)

        // set click events
        engBtn.setOnClickListener {
            textInfo.text = "Hello!"
        }

        spBtn.setOnClickListener {
            textInfo.text = "Hola!"
        }

        itlBtn.setOnClickListener {
            textInfo.text = "Ciao!"
        }

        frBtn.setOnClickListener {
            textInfo.text = "Bonjour!"
        }

        dutchBtn.setOnClickListener {
            textInfo.text = "Hallo!"
        }

    }

}