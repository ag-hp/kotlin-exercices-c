package org.ies.tierno

data class Student(
    val name: String,
    val surname: String,
    val email: String,
    val zipCode: Int
)

fun mapToEmails(students: List<Student>): List<String> =
    // ⮦ Por cada student, dame su email
    students.map { it.email } // it = el elemento actual


fun main() {
    val students = listOf(
        Student("Ana", "García", "ana@gmail.com", 28001),
        Student("Juan", "López", "juan@gmail.com", 28002),
        Student("Pedro", "Sánchez", "pedro@gmail.com", 28003)
    )
    println(mapToEmails(students))
}