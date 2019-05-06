package com.example.jeff

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iniciar = findViewById<Button>(R.id.button_iniciar)
        iniciar.setOnClickListener {
            val intent = Intent(this,Registro::class.java)
            startActivity(intent)
        }


    }

}
