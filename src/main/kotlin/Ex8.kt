package org.ies.tierno

fun sum(numbers: List<Double>): Double =
    numbers.sum()

fun main() {
    val numbers = listOf(2.5, 6.3, 10.5)
    println(sum(numbers))
}