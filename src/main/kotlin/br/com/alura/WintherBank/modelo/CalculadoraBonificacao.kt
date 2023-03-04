package br.com.alura.WintherBank.modelo

import br.com.alura.WintherBank.modelo.Funcionario

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun SomaBonificaçao(funcionario: Funcionario) {

        this.total = total + funcionario.bonificacao

    }
}


