class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = 1234
), Autenticavel {
    override val bonificacao: Double
        get() = salario + plr

    override fun autentica(senha: Int): Boolean {
        return super<Autenticavel>.autentica(senha)
    }

}