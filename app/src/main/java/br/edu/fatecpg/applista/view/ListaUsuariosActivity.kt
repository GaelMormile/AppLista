package br.edu.fatecpg.applista.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.applista.R
import br.edu.fatecpg.applista.adapter.UsuarioAdapter
import br.edu.fatecpg.applista.model.UsuarioDaoImpl

class ListaUsuariosActivity : AppCompatActivity(R.layout.activity_lista_usuarios) {
    private val dao = UsuarioDaoImpl()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val rvUsuarios = findViewById<RecyclerView>(R.id.rv_usuarios)
        val usuarios = dao.obterUsuarios()
        rvUsuarios.layoutManager = LinearLayoutManager(this)
        rvUsuarios.adapter = UsuarioAdapter(usuarios)
    }
}