package dev.estudos.kotlin.exercicios

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

internal class Exercicio1Test {

    @Test
    @DisplayName("Distancia entre os pontos P(1, 10) e P(30, 50) deve ser 49")
    fun given_PontoX1Igual1eY1Igual10_when_calcularDistancia_then_resultadoDeveSer49() {
        //given (input)
        val p1 = Exercicio1.Ponto(1,10)
        val p2 = Exercicio1.Ponto(30,50)

        //when (ação, process)
        val resultado = Exercicio1.calcularDistancia(p1, p2)

        //then (saída)
        assertEquals(49,resultado)
    }

    @Test
    @DisplayName("Distancia entre os pontos P(-15, -50) e P(10,80) deve ser 132")
    fun p1ComValoresNegativosEP2ComValoresPositivos() {
        val p1 = Exercicio1.Ponto(-15,-50)
        val p2 = Exercicio1.Ponto(10,80)

        val resultado = Exercicio1.calcularDistancia(p1, p2)

        assertEquals(132, resultado)
    }
}