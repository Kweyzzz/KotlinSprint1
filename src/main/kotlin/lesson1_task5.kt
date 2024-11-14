package org.example

fun main() {

    val totalSeconds: Int = 6480
    val const = 60
    val hours: Int = totalSeconds / 3600
    val minutes: Int = (totalSeconds % 3600) / const
    val seconds: Int = totalSeconds % const
    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}
