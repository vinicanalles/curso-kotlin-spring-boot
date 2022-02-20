package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "$nome tem $idade anos!"
    }
}

fun main() {
    var vinicius = Pessoa("Vinicius", 26)
    println(vinicius)
}