package org.example

fun main(){
    print("Введите имя: ")
    val name = readLine()
    var greeting = "Доброе день,$name!"
    println(greeting)
    greeting = "Добрый вечер,$name!"
    println(greeting)
}