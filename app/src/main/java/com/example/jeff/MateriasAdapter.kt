package com.example.jeff

import android.support.design.widget.FloatingActionButton
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText

class MateriasAdapter(val list: ArrayList<MateriaDataClass>, listener: ItemClickListener): RecyclerView.Adapter<MateriasAdapter.ViewHolder>() {


    private val onItemClickListener: ItemClickListener = listener

    override fun onBindViewHolder(holder: MateriasAdapter.ViewHolder, position: Int) {
        val item = list[position]
        holder.editText4.hint = item.nombre

        holder.borrarMateria.setOnClickListener {
            View -> onItemClickListener.onItemClick(holder, position)
        }
    }
    override fun getItemCount() = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.materia_item, parent,false))
    }

    inner class ViewHolder(mView: View): RecyclerView.ViewHolder(mView) {
        val editText4 = mView.findViewById<EditText>(R.id.editText4)
        val borrarMateria = mView.findViewById<FloatingActionButton>(R.id.borrarMateria)
    }

    interface ItemClickListener {
        fun onItemClick(item: ViewHolder, position: Int)
    }
}