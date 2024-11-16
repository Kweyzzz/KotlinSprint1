package org.example

fun main() {
    var crystalOre: Int = 7
    var ironOre: Int = 11
    val buff = 0.2
    crystalOre += (crystalOre * buff).toInt()
    ironOre += (ironOre * buff).toInt()

    println(crystalOre)
    println(ironOre)
}