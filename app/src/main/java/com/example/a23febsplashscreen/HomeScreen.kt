package com.example.a23febsplashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeScreen : AppCompatActivity() {
    private lateinit var pizzaButton : Button
    private lateinit var kdramaButton : Button
    private lateinit var croissantButton : Button
    private lateinit var gaucButton: Button
    private lateinit var chaiButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        pizzaButton = findViewById(R.id.button)
        kdramaButton = findViewById(R.id.btnKorean)
        croissantButton = findViewById(R.id.btnFrench)
        gaucButton = findViewById(R.id.btnSpanish)
        chaiButton = findViewById(R.id.btnHindi)

        pizzaButton.setOnClickListener {
            var pastaIntent = Intent( this, MarioHome::class.java)
            startActivity(pastaIntent)
        }
        kdramaButton.setOnClickListener {
            var btsIntent = Intent( this, KoreanHome::class.java)
            startActivity(btsIntent)
        }
        croissantButton.setOnClickListener {
            var napoleanIntent = Intent( this, FrenchHome::class.java)
            startActivity(napoleanIntent)
        }

        gaucButton.setOnClickListener {
            var tacoIntent = Intent( this, SpanishHome::class.java)
            startActivity(tacoIntent)
        }

        chaiButton.setOnClickListener {
            var rotiIntent = Intent( this, HindiHome::class.java)
            startActivity(rotiIntent)
        }
    }
}