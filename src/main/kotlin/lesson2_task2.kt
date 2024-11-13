package org.example

fun main(){
    val salaryOfPermanentEmployees:Int = 50 * 30000
    val generalEmployeeExpenses:Int = salaryOfPermanentEmployees + (30 * 20000)
    val totalEmployees = 50 + 30
    val averageSalaryPerEmployee:Int = generalEmployeeExpenses/totalEmployees

    println(salaryOfPermanentEmployees)
    println(generalEmployeeExpenses)
    println(averageSalaryPerEmployee)

}