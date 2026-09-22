package org.ies.tierno

fun filterByZipCode(students: List<Student>, zipCode: Int): List<Student> =
    // ⮦ Por cada student, dame su email
    students.filter { it.zipCode == zipCode } // it = el elemento actual


fun main(){
    val students = listOf(
        Student("Ana", "García", "ana@gmail.com", 28001),
        Student("Juan", "López", "juan@gmail.com", 28002),
        Student("Pedro", "Sánchez", "pedro@gmail.com", 28002)
    )
    println(filterByZipCode(students, 28002))
}