package dev.estudos.kotlin.exercicios

//2. Escreva um algoritmo que leia três números inteiros e positivos (A, B, C) e
//calcule a seguinte expressão:
//R = (A + B)²
//S = (B + C)²
//D = R + S / 2

import kotlin.math.pow

fun main() {

    val a = readInt(msg="Digite o primeiro número inteiro: ")
    val b = readInt(msg="Digite o segundo número inteiro: ")
    val c = readInt(msg="Digite o terceiro número inteiro: ")

    val r = Exercicio2.calcularR(a!!, b!!)
    val s = Exercicio2.calcularS(b!!, c!!)
    val d = Exercicio2.calcularD(r!!, s!!)
    print("O resultado é: ${d}")
}

object Exercicio2 {

    fun calcularD(r: Int, s: Int): Int {
        return (r + s) / 2
    }

    fun calcularR(a: Int, b: Int): Int {
        return (a + b).toDouble().pow(2).toInt()
    }

    fun calcularS(b: Int, c: Int): Int {
        return (b + c).toDouble().pow(2).toInt()
    }
}