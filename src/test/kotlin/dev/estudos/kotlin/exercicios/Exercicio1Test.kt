package dev.estudos.kotlin.exercicios

import org.junit.jupiter.api.Assertions.*

internal class Exercicio1Test {

    @org.junit.jupiter.api.Test
    fun calcularDistancia() {
        val p1 = Exercicio1.Ponto(1,10)
        val p2 = Exercicio1.Ponto(30,50)

        val resultado = Exercicio1.calcularDistancia(p1, p2)

        assertEquals(49, resultado)
    }
}