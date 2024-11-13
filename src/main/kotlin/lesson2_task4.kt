package org.example

fun main(){
    var crystalOre: Int = 7
    var ironOre: Int = 11

    crystalOre += (crystalOre * 0.2).toInt()
    ironOre += (ironOre * 0.2).toInt()

    println(crystalOre)
    println(ironOre)

}