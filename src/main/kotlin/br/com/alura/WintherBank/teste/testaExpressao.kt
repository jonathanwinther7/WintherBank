package br.com.alura.WintherBank.teste

fun testaExpressao() {
    println("inico main")
    val entrada: String = "1"


    var valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

//    val valorComTaxa: Double? = when {
//        valorRecebido != null -> {
//            valorRecebido + 0.1
//        }
//
//        else -> {
//            null
//        }
//    }


    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor invalido")
    }

    println("valor recebido: $valorRecebido")


}
