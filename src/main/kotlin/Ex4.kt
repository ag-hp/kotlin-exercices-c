package org.ies.tierno

fun sum(list: List<Int>): List<Int> =
    list.map { it + 10 }

fun main() {
    val list = listOf(4, 78, 11)
    println(sum(list))
}

