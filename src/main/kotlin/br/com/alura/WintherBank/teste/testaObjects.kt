package br.com.alura.WintherBank.teste

import br.com.alura.WintherBank.modelo.*

fun testaObjects() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        override val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)
    println("nome do cliente ${fran.nome}")


    val alex = Cliente(nome = "jonathan", cpf = "", senha = 1);
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000, 2);
    val contaCorrente = ContaCorrente(titular = alex, numero = 2000, 1);
    println("total de contas: ${Conta.total}")
}
