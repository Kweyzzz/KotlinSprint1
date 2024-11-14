package org.example

fun main() {
    val year: String = "1961"
    var hour: String = "09"
    var minute: String = "07"
    println("Год полета - $year")
    println("Взлет - $hour часов")
    println("Взлет - $minute минут")
    hour = "10"
    minute = "55"
    println("Посадка - $hour:$minute")
}