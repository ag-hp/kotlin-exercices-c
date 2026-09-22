package org.ies.tierno

fun evenNumbers(numbers: List<Int>): List<Int> =
    numbers.filter { it % 2 == 0 } // numeros pares entre 2 se hacen

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(evenNumbers(numbers))
}