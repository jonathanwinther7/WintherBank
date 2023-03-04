package br.com.alura.WintherBank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
      if(admin.autentica(senha)){
          println("Bem vindo ao WintherBank")
      } else{
          println("Falha na autenticação")
      }
    }


}