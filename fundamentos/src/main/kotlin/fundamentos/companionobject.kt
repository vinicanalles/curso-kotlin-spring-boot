package fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    //funciona como um método estático, não precisamos instanciar a classe para depois utilizar, já conseguimos chamar e utilizar diretamente
    companion object {
        fun criarComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Gustavo", "Rua Teste", 24)
        }

        fun criarAPartirDeSegundaClasse(segundaClasse: SegundaClasse): MinhaClasse {
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun criarComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Gustavo", "Rua Teste", 24)
    }
}

fun main() {
    var segundaClasse = SegundaClasse("nome", "endereco", 10).criarComValoresPadrao()
    var minhaClasse = MinhaClasse.criarAPartirDeSegundaClasse(segundaClasse)
}