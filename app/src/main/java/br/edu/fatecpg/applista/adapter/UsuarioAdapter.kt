package br.edu.fatecpg.applista.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.applista.R
import br.edu.fatecpg.applista.model.Usuario
import kotlin.random.Random

class UsuarioAdapter(private val usuarios: List<Usuario>):
        RecyclerView.Adapter<UsuarioAdapter.ViewHolder>(){
    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val txvNome = itemView.findViewById<TextView>(R.id.txv_nome_usuario)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context)
           .inflate(R.layout.item_usuario,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }



}