import modelo.Analista

fun testaFuncionarios() {
    val jonathan = Contador(
        nome = "Jonathan",
        cpf = "012.796.232.84",
        salario = 5000.0
    )
    println("nome ${jonathan.nome}");
    println("cpf ${jonathan.cpf}");
    println("salario ${jonathan.salario}");
    println("bonificção ${jonathan.bonificacao}");

    val cleo = Gerente(
        nome = "Cleo",
        cpf = "598.731.592.15",
        salario = 5348.0,
        senha = 1234,
        plr = 200.0
    )

    println("nome ${cleo.nome}");
    println("cpf ${cleo.cpf}");
    println("salario ${cleo.salario}");
    println("bonificacão ${cleo.bonificacao}")
    println("plr ${cleo.plr}")

    if (cleo.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val jordan = Diretor(
        nome = "jordan",
        cpf = "592.175.385-15",
        salario = 43803.0,
        senha = 4000,
        plr = 250.0,

    )
    println("nome ${jordan.nome}");
    println("cpf ${jordan.cpf}");
    println("salario ${jordan.salario}");
    println("bonificacão ${jordan.bonificacao}");
    println("plr ${jordan.plr}");

    jordan.autentica(4000)

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444.45",
        salario = 4519.0,
    )
    println("nome ${maria.nome}");
    println("cpf ${maria.cpf}");
    println("salario ${maria.salario}");
    println("bonificacão ${maria.bonificacao}")

    val gabriela = Economista(
        nome = "Gabriela",
        cpf = "584.184.320.20",
        salario = 4903.0
    )

    println("nome ${gabriela.nome}")
    println("cpf ${gabriela.cpf}")
    println("salario ${gabriela.salario}");
    println("bonificacão ${gabriela.bonificacao}")

    val jose = Contador(
        nome = "Jose",
        cpf = "040.356.481.87",
        salario = 5200.0
    )
    println("nome ${jose.nome}")
    println("cpf ${jose.cpf}")
    println("salario ${jose.salario}");
    println("bonificacão ${jose.bonificacao}")


    val calculadora = CalculadoraBonificacao()
    calculadora.SomaBonificaçao(jordan)
    calculadora.SomaBonificaçao(jonathan)
    calculadora.SomaBonificaçao(cleo)
    calculadora.SomaBonificaçao(maria)
    calculadora.SomaBonificaçao(jose)
    calculadora.SomaBonificaçao(gabriela)

    println("total de bonificação: ${calculadora.total}")
}