package PrimerBloque.Tema17

fun returnGreater(v1: Int, v2: Int) = if (v1 > v2) v1 else v2

fun main() {
    println("Enter 2 numbers: ")
    var num1 = readln().toInt()
    var num2 = readln().toInt()

    println("The greater is ${returnGreater(num1, num2)}")
}