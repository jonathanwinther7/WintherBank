package br.com.alura.WintherBank.modelo

interface Autenticavel {

    val senha: Int

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}