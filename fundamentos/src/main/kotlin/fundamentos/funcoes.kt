package fundamentos

fun main() {
    dizOi(retornaNome(), 26)
    dizOi(idade = 26, nome = retornaNome())
    dizOi("Daniel")
}

fun retornaNome(): String {
    return "Vinicius"
}

fun dizOi(nome: String, idade: Int = 20) {
    println("Oi $nome, parabéns pelos seus $idade anos!")
}