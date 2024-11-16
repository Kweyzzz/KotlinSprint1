package org.example

fun main() {
    val trainDepartureTimeInHours: Int = 9
    val trainDepartureTimeInMinutes: Int = 39
    val timeInMinutes = 457
    val totalTravelTime: Int = timeInMinutes + trainDepartureTimeInMinutes
    val const = 60

    val travelTimeInHours = trainDepartureTimeInHours + (totalTravelTime / const)
    val travelTimeInMinutes =  totalTravelTime % const
    println("Время прибытия поезда: ${travelTimeInHours}ч ${travelTimeInMinutes}м")
}