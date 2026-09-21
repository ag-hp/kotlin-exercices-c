# Ejercicios

1. Escribe un programa que cree una lista y lo rellene con varios String. Luego recórrelo mostrando en pantalla cada elemento.

2. Escribe un método first(list: List<String> ) que dada una lista de String y devuelva el que está en la primera posición.

3. Escribe un método last(list: List<Int>) que dada una lista de Int y devuelva el que está en la última posición.

4. Un método sum10(numbers: List<Int> numbers) que dado una lista de enteros, devuelve otra lista de enteros del mismo tamaño en la que se le ha sumado 10 a cada número de la primera lista.

5. Un método mapToEmails(students: List<Student>):List<String> que dada una lista de estudiantes, devuelva una lista de los emails de los estudiantes en el mismo orden

``` java
data class Student(
    val name: String,
    val surname: String,
    val email: String,
    val zipCode: Int
)
```

6. Un método  filterByZipCode(students: List<Student>,  zipCode: Int): List<Student> que dada una lista de estudiantes y un código postal, devuelva una lista con los estudiantes que vivan en ese código postal

7. Un método que recibe una lista de números enteros (numbers) y devuelve otra lista con los números pares que había en numbers

8. Un método sum( numbers: List<Double> ) que calcula la suma de los números en la lista, si la lista está vacía devuelve 0.

9. Un método average( numbers: List<Double> ) que calcula la media de los números en la lista. Si la lista está vacía devuelve null.

10. Un método max( numbers: List<Double> ) que busca el máximo de los números en la lista. Si la lista está vacía devuelve null.

11. Un método min( numbers: List<Double>) que busca el mínimo de los números en la lista. Si la lista está vacía devuelve null.

12. Un método junction(numbers1: List<Double> , numbers2: List<Double>) que dadas dos listas de números, devuelve los números que están tanto numbers1 como en numbers2

13. Un método que dado una lista de pedidos, devuelve una lista con los precios de cada pedido

``` java
data class Order(val id: Int, val price: Double, val items: List<OrderItem>)
data class OrderItem(val itemId: Int, val price: Double)
```

14. Un método que dado una lista de pedidos, devuelve el precio total de todos los pedidos

15. Un método que dado una lista de pedidos, devuelva una lista con todos los OrderItem
