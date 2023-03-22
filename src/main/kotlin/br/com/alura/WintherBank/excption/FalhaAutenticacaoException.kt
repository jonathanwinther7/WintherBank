package br.com.alura.WintherBank.excption

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticacao"
) : Exception(mensagem)