package PrimerBloque.Tema6

fun main(parameter: Array<String>) {
    println("Enter two numbers")
    var num1 = readln().toInt()
    var num2 = readln().toInt()

    val greater = if (num1 > num2) num1 else num2
    println("El mayor entre $num1 y $num2 es $greater")
}