package dev.estudos.kotlin.exercicios

import java.time.LocalDate
import java.time.format.DateTimeFormatter

//3. Faça um algoritmo que leia a data de nascimento de uma pessoa expressa
//no formato (DD/MM/AAAA), e mostre-a expressa apenas em dias.

fun main() {
    val data = "07/02/1984"
    val data2 = convertStingDate(data)
    println(data2)
    //val string = "2017-07-25"
    //val date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE)
    //val dia = date.dayOfMonth
    //println(dia)
}

fun convertStingDate(d: String): String {
    return  d.substring(6,10) + "-" +
            d.substring(3,5)  + "-" +
            d.substring(0,2)
}