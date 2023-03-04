import br.com.alura.WintherBank.modelo.Cliente
import br.com.alura.WintherBank.modelo.Diretor
import br.com.alura.WintherBank.modelo.Gerente
import br.com.alura.WintherBank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "alex",
        cpf = "156.126.264.15",
        salario = 1000.0,
        senha = 1234,
        plr = 200.0
    )

    val diretor = Diretor(
        nome = "alexandre",
        cpf = "222.222.222.15",
        salario = 3000.0,
        senha = 12345,
        plr = 250.0
    )

    val cliente = Cliente(
        nome = "gui",
        senha = 1324,
        cpf = "222.222.222-25"
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 12345)
    sistema.entra(cliente, 1324)
}
