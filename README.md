<p align="center">
  <img width="1759" height="450" alt="ChatGPT Image 22 sept 2026, 13_55_27" src="https://github.com/user-attachments/assets/59928979-d52d-4e9e-96b3-489a04b11389" />
</p>

<h1 align="center">PROGRAMACIÓN MULTIMEDIA Y DISPOSITIVOS MÓVILES</h1>

<div align="center">
<a href="https://kotlinlang.org/"><img src="https://img.shields.io/badge/Kotlin-7F52FF?style=flat&logo=kotlin&logoColor=white" alt="Kotlin"></a>
&nbsp;
<a href="https://www.jetbrains.com/idea/"><img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=flat&logo=intellij-idea&logoColor=white" alt="IntelliJ IDEA"></a>
&nbsp;
<a href="https://gradle.org/"><img src="https://img.shields.io/badge/Gradle-02303A?style=flat&logo=gradle&logoColor=white" alt="Gradle"></a>
&nbsp;
<a href="LICENSE"><img src="https://img.shields.io/badge/License-Educational-blue?style=flat" alt="Educational License"></a>
&nbsp;
<a href="https://fp-informatica.gitbook.io/programacion-multimedia/ut00-introduccion-a-kotlin/colecciones/ejercicios"><img src="https://img.shields.io/badge/Ejercicios-Colecciones-orange?style=flat" alt="Ejercicios Kotlin"></a>
&nbsp;
<img src="https://img.shields.io/badge/Estado-En_proceso-yellow?style=flat" alt="En proceso">
</div>

<h2>UT00 - Introducción a Kotlin → Colecciones → Ejercicios</h2>

<h3>1. Escribe un programa que cree una lista y lo rellene con varios String. Luego recórrelo mostrando en pantalla cada elemento.</h3>

<h3>2. Escribe un método first(list: List&lt;String&gt;) que dada una lista de String y devuelva el que está en la primera posición.</h3>

<h3>3. Escribe un método last(list: List&lt;Int&gt;) que dada una lista de Int y devuelva el que está en la última posición.</h3>

<h3>4. Un método sum10(numbers: List&lt;Int&gt;) que dado una lista de enteros, devuelve otra lista de enteros del mismo tamaño en la que se le ha sumado 10 a cada número de la primera lista.</h3>

<h3>5. Un método mapToEmails(students: List&lt;Student&gt;): List&lt;String&gt; que dada una lista de estudiantes, devuelva una lista de los emails de los estudiantes en el mismo orden.</h3>

```kotlin
data class Student(
    val name: String,
    val surname: String,
    val email: String,
    val zipCode: Int
)
```

<h3>6. Un método filterByZipCode(students: List&lt;Student&gt;, zipCode: Int): List&lt;Student&gt; que dada una lista de estudiantes y un código postal, devuelva una lista con los estudiantes que vivan en ese código postal.</h3>

<h3>7. Un método que recibe una lista de números enteros (numbers) y devuelve otra lista con los números pares que había en numbers.</h3>

<h3>8. Un método sum(numbers: List&lt;Double&gt;) que calcula la suma de los números en la lista, si la lista está vacía devuelve 0.</h3>

<h3>9. Un método junction(numbers1: List&lt;Double&gt;, numbers2: List&lt;Double&gt;) que dadas dos listas de números, devuelve los números que están tanto numbers1 como en numbers2.</h3>

<h3>10. Un método que dado una lista de pedidos, devuelve una lista con los precios de cada pedido.</h3>

```kotlin
data class Order(val id: Int, val price: Double, val items: List<OrderItem>)
data class OrderItem(val itemId: Int, val price: Double)
```

<h3>11. Un método que dado una lista de pedidos, devuelve el precio total de todos los pedidos.</h3>

<h3>12. Un método que dado una lista de pedidos, devuelve una lista con todos los OrderItem.</h3>
