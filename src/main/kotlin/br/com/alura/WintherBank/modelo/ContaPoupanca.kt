package br.com.alura.WintherBank.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTrasnferivel(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}
