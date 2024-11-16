package org.example

fun main () {
    val totalSeconds: Int = 6480
    val const1 = 60
    val const2 = 3600
    val hours: Int = totalSeconds / const2
    val minutes: Int = (totalSeconds % const2) / const1
    val seconds: Int = totalSeconds % const1
    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}
