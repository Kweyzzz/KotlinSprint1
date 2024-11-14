package org.example

fun main(){
    val student1: Float = 3f
    val student2: Float = 4f
    val student3: Float = 3f
    val student4: Float = 5f
    val const: Int = 4

    val averagePoint: Float = (student1 + student2 + student3 + student4) / const
    println(String.format("%.2f",averagePoint))

}