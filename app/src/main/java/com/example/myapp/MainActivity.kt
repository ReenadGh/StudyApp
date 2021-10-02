package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var Button1: Button
    lateinit var Button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button1 = findViewById(R.id.b1)
        Button2 = findViewById(R.id.b2)

        Button1.setOnClickListener {
            val intent = Intent(this, Android::class.java)
            startActivity(intent)
        }
        Button2.setOnClickListener {
            val intent = Intent(this, Kotlin::class.java)
            startActivity(intent)
        }

    }




}



