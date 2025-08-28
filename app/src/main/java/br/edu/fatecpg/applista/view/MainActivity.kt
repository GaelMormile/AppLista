package br.edu.fatecpg.applista.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.applista.R
import br.edu.fatecpg.applista.model.Usuario
import br.edu.fatecpg.applista.model.UsuarioDao
import br.edu.fatecpg.applista.model.UsuarioDaoImpl
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val dao = UsuarioDaoImpl()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edtNomeUsuario = findViewById<EditText>(R.id.edt_nome_usuario)
        val btnCadastrar = findViewById<Button>(R.id.btn_cadastrar)
        val fabAvanca = findViewById<FloatingActionButton>(R.id.fab_avanca)
        btnCadastrar.setOnClickListener {
            val nome = edtNomeUsuario.text.toString()
            val usuario = Usuario(nome)
            dao.adicionarUsuario(usuario)
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Sucesso")
            builder.setMessage("Cadastro Ok!")
            val alert = builder.create()
            alert.show()
            edtNomeUsuario.text.clear()
        }
        fabAvanca.setOnClickListener {
            val intent = Intent(this,ListaUsuariosActivity::class.java)
            startActivity(intent)
        }
    }
}