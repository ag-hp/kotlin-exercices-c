package org.ies.tierno

data class Order(
    val id: Int,
    val price: Double,
    val items: List<OrderItem>
)

data class OrderItem(
    val itemId: Int,
    val price: Double
)

fun allItems(orders: List<Order>): List<OrderItem> =
    orders.flatMap { it.items }

fun main() {
}