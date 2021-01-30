package dev.estudos.kotlin.exercicios

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

//3. Faça um algoritmo que leia a data de nascimento de uma pessoa expressa
//no formato (DD/MM/AAAA), e mostre-a expressa apenas em dias.

fun main() {

    println("""
        Cálculo de dias de uma data de nascimento.
    """.trimIndent())

    print("Informe a data de nascimento (formato DD/MM/AAAA): ")
    val dataDigitada = readLine()

    val localDate = LocalDate.parse(dataDigitada, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
    val totalDias = Exercicio3.calcularDias(localDate)
    val totalDiasChronoUnit = Exercicio3.calcularDiasComChronoUnit(localDate)

    print("""
        ---------------------------
        Total de Dias (Padrão): $totalDias
        ---------------------------
        Total de Dias (ChronoUnit): $totalDiasChronoUnit
    """.trimIndent())

    //var period = Period.of(1984, 2, 7)
    //var date = LocalDate.of(2021, 1, 30)
    //var modifiedDate = date.minus(period)
    //var date1 = LocalDate.parse("1984-07-02")
    //var date2 = LocalDate.parse("2018-12-25")
    //var modifiedDate = period.between(date1, date2)
}

object Exercicio3 {
    fun calcularDias(data: LocalDate): Int {//Não considera ano-bissexto
        // diasTotal = date.days + (date.month * 30) + ((currentYear - date.year) * 365)
        // Exemplo: 10/05/1990
        // diasTotal = 10 + (5 * 30) + ((2021 - 1990) * 365)
        val currentYear = LocalDate.now().year
        val diasTotal = data.dayOfMonth + (data.monthValue * 30) + (currentYear - data.year) * 365
        return diasTotal
    }

    fun calcularDiasComChronoUnit(data: LocalDate): Int {//Mais preciso.
        val period = Period.between(data, LocalDate.now())
        val chronoUnit = ChronoUnit.DAYS.between(data, LocalDate.now())
        return chronoUnit.toInt()
    }
}