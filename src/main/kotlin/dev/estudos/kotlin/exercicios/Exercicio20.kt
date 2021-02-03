package dev.estudos.kotlin.exercicios

//20. Um vendedor necessita de um algoritmo que calcule o preço total devido
//por um cliente. O algoritmo deve receber o código de um produto e a
//quantidade comprada e calcular o preço total, usando a tabela abaixo:



fun main() {
    val prod = 1001
    val qtd = 10
    println("O total devido  $prod é:  ${Exercicio20.calcularPreco(prod, qtd)} ")
}

object Exercicio20 {
    data class TabelaPreco(val id: Int, val preco: Double)

    val tabelaPreco : List<TabelaPreco> = listOf(TabelaPreco(1001, 5.32),
                                                 TabelaPreco(1324, 6.45),
                                                 TabelaPreco(6548, 2.37),
                                                 TabelaPreco(987, 5.32),
                                                 TabelaPreco(7623, 6.45))


    fun calcularPreco(id: Int, qnt: Int): Double {
        val tabela  = tabelaPreco.filter { it.id == id }

        var total: Double = 0.0

        for (t in tabela) {
            total += (t.preco * qnt)
        }
        return total
    }
}