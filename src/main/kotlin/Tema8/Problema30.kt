package Tema8

fun main() {
    println("Enter 3 random numbers: ")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

    if (num1 < 10 || num2 < 10 || num3 < 10) {
        println("Some number are greaer than 10")
    }
}