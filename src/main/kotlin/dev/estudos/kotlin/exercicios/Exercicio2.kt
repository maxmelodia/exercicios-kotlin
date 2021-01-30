package dev.estudos.kotlin.exercicios

//2. Escreva um algoritmo que leia três números inteiros e positivos (A, B, C) e
//calcule a seguinte expressão:

import kotlin.math.pow

fun main() {

    val a = readInt(msg="Digite o primeiro número inteiro: ")
    val b = readInt(msg="Digite o segundo número inteiro: ")
    val c = readInt(msg="Digite o terceiro número inteiro: ")

    val r = (a!! + b!!).toDouble().pow(2)
    val s = (b!! + c!!).toDouble().pow(2)

    val d = (r + s)/2
    print("O resultado é: ${d}")
}