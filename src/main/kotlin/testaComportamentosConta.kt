fun testaComportamentosConta() {
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000)
    contaAlex.deposita(valor = 200.0)

    val contaFran = ContaPoupanca(numero = 1001, titular = "Fran")
    contaFran.deposita(valor = 300.0)

    val contaWinther = ContaSalario(numero = 1005, titular = "Winther")
    contaWinther.deposita(valor = 500.0)

    println(contaWinther.titular)
    println(contaWinther.numero)
    println(contaWinther.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)


    println("Deposito concluido na sua conta Winther")
    contaWinther.deposita(valor = 150.0)
    println(contaWinther.saldo)

    println("Deposito concluido na sua conta Alex")
    contaAlex.deposita(valor = 50.0)
    println(contaAlex.saldo)

    println("Deposito concluido na sua conta Fran")
    contaFran.deposita(valor = 70.0)
    println(contaFran.saldo)

    println("seu saque foi realizado com sucesso Winther")
    contaWinther.saca(valor = 300.0)
    println(contaWinther.saldo)

    println("seu saque foi feito com sucesso Alex")
    contaAlex.saca(valor = 250.0)
    println(contaAlex.saldo)

    println("seu saque foi feito com sucesso Fran")
    contaFran.saca(valor = 100.0)
    println(contaFran.saldo)

    println("saque em exesso na conta do Alex")
    contaAlex.saca(valor = 100.0)
    println(contaAlex.saldo)

    println("saque em exesso na conta do Fran")
    contaAlex.saca(valor = 500.0)
    println(contaAlex.saldo)

    println("transferencia da conta da Fran para o Alex")

    if (contaFran.trasnfere(destino = contaAlex, valor = 200.0)) {
        println("transferência concluida")
    } else {
        println("Falha na trasnferencia")
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)
}
