package br.com.alura.WintherBank.modelo

var totalContas = 0
    private set

abstract class Conta(
    var titular: Cliente,
    val numero: Int,
) {
    var saldo = 0.0
        protected set
    init {
        println("Criando conta")
        totalContas++
    }


    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)
}