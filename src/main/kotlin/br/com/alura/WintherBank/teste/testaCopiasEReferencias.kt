import br.com.alura.WintherBank.modelo.Cliente
import br.com.alura.WintherBank.modelo.ContaCorrente
import br.com.alura.WintherBank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {

    val numeroX = 10
    val numeroY = numeroX


    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome= "João", cpf = "", senha = 1)

    val contaJoao = ContaCorrente(joao, 1002, 1)
    contaJoao.titular.nome = "Joao"
    var contaMaria = ContaPoupanca(Cliente(
        nome = "Maria",
        cpf = "",
        senha = 2
    ), 1003, 2)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}
