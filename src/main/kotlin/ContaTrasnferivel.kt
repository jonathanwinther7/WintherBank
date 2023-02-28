abstract class ContaTrasnferivel(
    titular: String,
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
