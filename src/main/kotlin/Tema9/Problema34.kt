package Tema9

fun main() {
    var num = 1
    var suma = 0

    while (num <= 10) {
        println("Ingrese un valor")
        val numbers = readln().toInt()

        suma = suma + numbers
        num = num + 1
    }
    println("The sum of the 10 valors is $suma")

    val average = suma / 10
    println("The average is $average")
}