package br.com.alura.WintherBank.teste

import br.com.alura.WintherBank.excption.SaldoInsuficienteException

fun funcao1() {
    println("inicio funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
        println("ClassCastExpection foi pegada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("inicio funcao2")
    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
        println("fim funcao2")
    }
}