package org.example

fun main() {
    val permanentEmployees = 50
    val salaryOneEmployee = 30000
    val trainees = 30
    val salaryOneTrainees = 20000
    val salaryOfPermanentEmployees: Int = permanentEmployees * salaryOneEmployee

    val generalEmployeeExpenses: Int = salaryOfPermanentEmployees + (trainees * salaryOneTrainees)
    val totalEmployees = permanentEmployees + trainees
    val averageSalaryPerEmployee:Int = generalEmployeeExpenses/totalEmployees

    println(salaryOfPermanentEmployees)
    println(generalEmployeeExpenses)
    println(averageSalaryPerEmployee)

}