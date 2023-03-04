package br.com.alura.WintherBank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    override val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}