import br.com.alura.WintherBank.modelo.*

var totalContas = 0
    private set

fun main() {

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
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000);
    val contaCorrente = ContaCorrente(titular = alex, numero = 2000);
    testaContasDiferentes()
    println("total de contas: ${totalContas}")
}



