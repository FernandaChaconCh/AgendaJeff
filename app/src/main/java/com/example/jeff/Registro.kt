package com.example.jeff

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val siguiente = findViewById<Button>(R.id.button_iniciar)
        siguiente.setOnClickListener {
            val intent = Intent(this, Materias::class.java)
            startActivity(intent)
        }
    }
}
