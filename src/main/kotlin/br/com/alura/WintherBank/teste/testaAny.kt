package br.com.alura.WintherBank.teste

import br.com.alura.WintherBank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(
        logradouro = "rua navegantes",
        complemento = "alura",
        cep = "222222-22"
    )
    val enderecoNovo = Endereco(
        logradouro = "rua navegantes",
        complemento = "alura",
        cep = "222222-22"
    )
    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco)
    println(enderecoNovo)
    println(
        "${endereco.javaClass}@${
            Integer.toHexString(endereco.hashCode())
        }"
    )
    fun imprime(valor: Any): Any {
        println(valor)
        return valor
    }
}
