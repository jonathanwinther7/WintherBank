package br.com.alura.WintherBank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = 12345
), Autenticavel {
    override val bonificacao: Double
        get() = salario + plr

    override fun autentica(senha: Int): Boolean {
        return super<FuncionarioAdmin>.autentica(senha)
    }
}
