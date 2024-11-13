package org.example

fun main(){
    val trainDepartureTimeInHours:Int = 9
    val trainDepartureTimeInMinutes:Int = 39
    val totalTravelTime:Int = 457 + trainDepartureTimeInMinutes

    val travelTimeInHours = trainDepartureTimeInHours + (totalTravelTime / 60)
    val travelTimeInMinutes =  totalTravelTime % 60
    println("Время прибытия поезда: ${travelTimeInHours}ч ${travelTimeInMinutes}м")

}