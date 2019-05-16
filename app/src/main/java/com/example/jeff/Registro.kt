package com.example.jeff

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Registro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val name = findViewById<EditText>(R.id.nombre)
        val matricula = findViewById<EditText>(R.id.matricula)
        val licenciatura = findViewById<EditText>(R.id.licenciatura)

        val siguiente = findViewById<Button>(R.id.button_continuar)
        siguiente.setOnClickListener {


            val msg1: String = name.text.toString()
            val msg2: String = matricula.text.toString()
            val msg3: String = licenciatura.text.toString()

            if(msg1.isNotBlank() && msg2.isNotBlank() && msg3.isNotBlank()) {
                //Toast.makeText(applicationContext, "Message : "+msg1, Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Materias::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "Please enter some message! ", Toast.LENGTH_SHORT).show()
            }




        }


    }
}
