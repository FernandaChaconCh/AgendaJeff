package com.example.jeff

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button

import kotlinx.android.synthetic.main.activity_materias.*

class Materias : AppCompatActivity(), MateriasAdapter.ItemClickListener {
    override fun onItemClick(item: MateriasAdapter.ViewHolder, position: Int) {
        materiasList.remove(materiasList[position])
        materiasRecycler.adapter!!.notifyDataSetChanged()
    }

    private lateinit var materiasRecycler: RecyclerView
    private lateinit var materiasAdapter: MateriasAdapter
    private val materiasList = ArrayList<MateriaDataClass>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materias)
        setSupportActionBar(toolbar)

        materiasAdapter = MateriasAdapter(materiasList, this)
        materiasRecycler = findViewById(R.id.materiasRecycler)
        materiasRecycler.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = materiasAdapter
        }

        val btnCont = findViewById<Button>(R.id.button_continuar)
        var count = 0
        btnCont.setOnClickListener {
            count++
            materiasList.add(
                MateriaDataClass(
                    count,
                    "Nombre Materia " //$count

                )
            )
            materiasRecycler.adapter!!.notifyDataSetChanged()
        }

        val siguiente = findViewById<Button>(R.id.button_siguiente)
        siguiente.setOnClickListener {
            val intent = Intent(this,Principal::class.java)
            startActivity(intent)
        }


        }

    }

