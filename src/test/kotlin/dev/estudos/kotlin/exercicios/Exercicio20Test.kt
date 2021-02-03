package dev.estudos.kotlin.exercicios

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

internal class Exercicio20Test {

    @Test
    @DisplayName("Preco total conforme tabela precoXproduto Exercicio 20")
    fun Cenario1(){
        val prod = 1001
        val qtd = 10
        val resultado = Exercicio20.calcularPreco(prod, qtd)

        assertEquals(53.2,resultado)
    }
}