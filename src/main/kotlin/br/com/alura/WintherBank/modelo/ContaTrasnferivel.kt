package br.com.alura.WintherBank.modelo

abstract class ContaTrasnferivel(
    titular: Cliente,
    numero: Int
) :  Conta(
    titular = titular,
    numero = numero
){

    fun trasnfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}
