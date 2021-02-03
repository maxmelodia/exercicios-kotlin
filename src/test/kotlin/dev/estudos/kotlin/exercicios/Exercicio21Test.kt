package dev.estudos.kotlin.exercicios

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

class Exercicio21Test {

    @Test
    @DisplayName("Preco total conforme tabela precoXproduto Exercicio21")
    fun Cenario1(){
        val prod = "ABCD"
        val qtd = 10

        var resultado: Double = 0.0

        if (Exercicio21.validarProdutoTabela(prod)) {
            resultado = Exercicio21.calcularPreco(prod, qtd)
        }

        assertEquals(53.0,resultado)
    }
}