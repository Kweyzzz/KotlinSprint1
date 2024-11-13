package org.example
import kotlin.math.pow

fun main(){
    val contributionAmount: Double = 70_000.0
    val interestRate: Double = 16.7
    val period:Int = 20

    val depositAmount: Double = contributionAmount * (1 + (interestRate/100)).pow(period)
    println("%.3f".format(depositAmount))
}