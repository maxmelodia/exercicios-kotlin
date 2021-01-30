package dev.estudos.kotlin.exercicios

import kotlin.math.pow
import kotlin.math.sqrt

class Exercicio1 {

    fun main() {

    }

    class Ponto(val x: Int, val y: Int)

    fun calcularDistancia(p1: Ponto, p2: Ponto): Int {

        val x2MenosX1 = (p2.x - p1.x).toDouble()
        val y2MenosY1 = (p2.y - p1.y).toDouble()

        val resultado = sqrt(x2MenosX1.pow(2) + y2MenosY1.pow(2))

        return resultado.toInt()

    }

}