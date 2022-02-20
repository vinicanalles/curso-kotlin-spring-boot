package fundamentos

fun main() {
    println(parOuImpar(2))
    println(parOuImpar(9))

    println(resultadoDaNota(3))
    println(resultadoDaNota(5))
    println(resultadoDaNota(8))
}

fun parOuImpar(numero: Int): String {
    return if (numero % 2 == 0)
        "Par"
    else
        "Impar"
}

//se a nota for maior do que 6 - passou
//se a nota for maior do que 4 - recuperação
//se a nota for menor do que 4 - reprovou
fun resultadoDaNota(nota: Int): String {
    return if (nota >= 6) {
        "Passou"
    } else if (nota >= 4) {
        "Recuperação"
    } else {
        "Reprovou"
    }
}