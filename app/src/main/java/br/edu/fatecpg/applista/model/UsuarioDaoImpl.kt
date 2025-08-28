package br.edu.fatecpg.applista.model

class UsuarioDaoImpl: UsuarioDao {
    companion object{
        private val usuarios = mutableListOf<Usuario>()
    }
    override fun adicionarUsuario(usuario: Usuario) {
        usuarios.add(usuario)

    }

    override fun obterUsuarios(): List<Usuario> {
        return usuarios

    }
}