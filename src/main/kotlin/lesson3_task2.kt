package org.example

fun main() {
    var lastName = "Андреева"
    val firstName = "Татьяна"
    val middleName = "Сергеевна"
    var age = 20

    println("$lastName $firstName $middleName, $age лет")

    lastName = "Сидорова"
    age = 22

    println("$lastName $firstName $middleName, $age года")
}
