package org.example

fun main() {
    val totalTables = 13
    val bookedToday = 13
    val bookedTomorrow = 9

    val availabilityToday = bookedToday < totalTables
    val availabilityTomorrow = bookedTomorrow < totalTables

    println("Доступность столиков на сегодня: $availabilityToday")
    println("Доступность столиков на завтра: $availabilityTomorrow")
}
