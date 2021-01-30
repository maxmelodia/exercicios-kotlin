package dev.estudos.kotlin.exercicios

import kotlin.math.pow
import kotlin.math.sqrt

//  1. Construa um algoritmo que, tendo como dados de entrada dois pontos
//     quaisquer no plano, P(x1,y1) e P(x2,y2), escreva a distância entre eles. A
//     fórmula que efetua tal cálculo é:
//     d = RAIZ_QUADRADA( (x2 - x1)² + (y2 - y1)² )

    fun main() {

        println("""
            Programa para cálculo de distância entre dois pontos qualquer em um plano P(x1,y1) e P(x2,y2)
            Informe os pontos x1,y1,x2,y2
        """.trimIndent())

        println("Digite o valor de x1: ")
        val x1 = readLine()?.toInt()//? Ciente que pode dar nullpointer exception;

        println("Digite o valor de y1: ")
        val y1 = readLine()?.toInt()

        println("Digite o valor de x2: ")
        val x2 = readLine()?.toInt()

        println("Digite o valor de y2: ")
        val y2 = readLine()?.toInt()

        var p1 = Ponto(x1!!, y1!!)//!!foça converão inteiro
        var p2 = Ponto(x2!!, y2!!)//!!foça converão inteiro

        var resultado = calcularDistancia(p1, p2)

        println("Distancia Calculada: $resultado")
        println("Fim!")
    }

    class Ponto(val x: Int, val y: Int)

    fun calcularDistancia(p1: Ponto, p2: Ponto): Int {
        val x2MenosX1 = (p2.x - p1.x).toDouble()
        val y2MenosY1 = (p2.y - p1.y).toDouble()
        val resultado = sqrt(x2MenosX1.pow(2) + y2MenosY1.pow(2))
        return resultado.toInt()
    }
