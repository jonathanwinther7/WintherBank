package br.com.alura.WintherBank.modelo

class ContaCorrente(
    titular: Cliente,
    numero: Int,
    override val senha: Int
) : ContaTrasnferivel(
    titular = titular,
    numero = numero,
    senha =  1
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}
