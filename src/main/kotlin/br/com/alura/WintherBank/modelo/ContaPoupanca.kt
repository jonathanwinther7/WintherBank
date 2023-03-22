package br.com.alura.WintherBank.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int,
    override val senha: Int
) : ContaTrasnferivel(
    titular = titular,
    numero = numero,
    senha = 2
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}
