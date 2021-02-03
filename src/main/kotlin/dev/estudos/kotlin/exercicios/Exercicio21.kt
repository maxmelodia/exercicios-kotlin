package dev.estudos.kotlin.exercicios

//21 Um vendedor precisa de um algoritmo que calcule o preço total devido por
//um cliente. O algoritmo deve receber o código de um produto e a quantidade
//comprada e calcular o preço total, usando a tabela abaixo. Mostre uma
//mensagem no caso de código inválido.

fun main() {
    val prod = "ABCD"
    val qtd = 10

    if (Exercicio21.validarProdutoTabela(prod)) {
        println("O total devido do produto $prod é:  ${Exercicio21.calcularPreco(prod, qtd)} ")
    }
}

object Exercicio21 {

    data class TabelaPreco(val produto: String, val preco: Double)

    val tabelaPreco : List<TabelaPreco> = listOf(TabelaPreco("ABCD", 5.30),
                                                 TabelaPreco("XYPK", 6.00),
                                                 TabelaPreco("KLMP", 3.20),
                                                 TabelaPreco("QRST", 2.50))


    fun calcularPreco(produto: String, qnt: Int): Double {
        val total  = Exercicio21.tabelaPreco.filter { it.produto == produto }.map{ it.preco * qnt }.first()
        return total
    }

    fun validarProdutoTabela(produto: String): Boolean {
        val filtro = Exercicio21.tabelaPreco.filter { it.produto == produto }

        if (filtro.size == 0) {
            println("Nenhum produto encontrado!")
            return false
        }
        return true
    }
}