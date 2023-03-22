package br.com.alura.WintherBank.excption

class SaldoInsuficienteException(
    mensagem: String = "O saldo é insuficiente") : Exception (mensagem){
}