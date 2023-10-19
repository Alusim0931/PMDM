package Tema17

fun returnAverage(v1: Int, v2: Int, v3: Int) = (v1 + v2 + v3)/3

fun main() {
    println("Enter 3 numbers")
    var num1 = readln().toInt()
    var num2 = readln().toInt()
    var num3 = readln().toInt()

    println("The greater numbers is ${returnAverage(num1, num2, num3)}")
}