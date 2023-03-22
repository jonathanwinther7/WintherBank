package br.com.alura.WintherBank.modelo

import br.com.alura.WintherBank.excption.FalhaAutenticacaoException
import br.com.alura.WintherBank.excption.SaldoInsuficienteException

abstract class ContaTrasnferivel(
    titular: Cliente,
    numero: Int,
    override val senha: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    fun trasnfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraído $valor"
            )
        }

        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()

        }
        saldo -= valor
        destino.deposita(valor)
    }
}
