package fundamentos

fun main() {
    var nome = "Vinicius"
    val nomeVal = "Vinicius"

    nome = "Daniel"
//    nomeVal = "Daniel"

    val idade = 24
    println(idade)

    val teste: String
    teste = "Teste"
}

class variaveis {
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"
    }
}