package dev.estudos.kotlin.exercicios

data class Curso(val nome: String, val disciplina: List<Disciplina>)
data class Disciplina(val nome: String, val cargaHoraria: Int)

val cursos : List<Curso> = listOf(
    Curso("Desenvolvimento Android", listOf(Disciplina("Kotlin",20))),
    Curso("React", listOf(Disciplina("HTML/CSS",20)))
)

fun main() {

    //val cursosDTOs = cursos.map {
    //    CursoDTO()
    //}

    //val todasAsDisciplinas = cursos.flatMap { it.disciplina }
    //println(todasAsDisciplinas.joinToString("\n"))
}