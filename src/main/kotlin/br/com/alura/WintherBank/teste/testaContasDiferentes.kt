import br.com.alura.WintherBank.modelo.*

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "jonathan",
            cpf = "",
            senha = 1,
            endereco = Endereco(
                logradouro = "Rua Vergueiro"
            )
        ),
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "gabriela", cpf = "", senha = 2),
        numero = 1001
    )

    val contaSalario = ContaSalario(
        titular = Cliente(nome = "Winther", cpf = "", senha = 3),
        numero = 1005
    )


    contaCorrente.deposita(valor = 1000.0)
    contaPoupanca.deposita(valor = 1000.0)
    contaSalario.deposita(valor = 385.0)

    println("endereco titular ${contaCorrente.titular.endereco.logradouro}")

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")
    println("saldo salario: ${contaSalario.saldo}")

    contaCorrente.saca(valor = 100.0)
    contaPoupanca.saca(valor = 100.0)
    contaSalario.saca(valor = 250.0)

    println("saldo após saque na sua conta poupança: ${contaPoupanca.saldo}")
    println("saldo após saque na sua conta corrente: ${contaCorrente.saldo}")
    println("salado após saque na sua conta salario ${contaSalario.saldo}")

    contaCorrente.trasnfere(valor = 100.0, contaPoupanca)

    println("saldo corrente apos transferir na conta poupança: ${contaCorrente.saldo}")
    println("saldo conta poupança após receber transferencia: ${contaPoupanca.saldo}")

    contaCorrente.trasnfere(100.0, contaSalario)

    println("saldo corrente após transferir para salário: ${contaCorrente.saldo}")
    println("saldo salário após receber trasnferência: ${contaSalario.saldo}")
}