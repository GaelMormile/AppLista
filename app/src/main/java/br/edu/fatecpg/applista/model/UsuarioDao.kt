package br.edu.fatecpg.applista.model

interface UsuarioDao {
    fun adicionarUsuario(usuario:Usuario)
    fun obterUsuarios(): List<Usuario>
}