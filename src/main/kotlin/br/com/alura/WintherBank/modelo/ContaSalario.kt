package br.com.alura.WintherBank.modelo

import br.com.alura.WintherBank.modelo.Conta

class ContaSalario(
    titular: Cliente,
    numero: Int,
    override val senha: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}
