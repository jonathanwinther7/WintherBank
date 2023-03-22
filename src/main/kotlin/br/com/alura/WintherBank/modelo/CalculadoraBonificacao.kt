package br.com.alura.WintherBank.modelo

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun SomaBonificaçao(funcionario: Funcionario) {
        this.total = total + funcionario.bonificacao

    }
}


