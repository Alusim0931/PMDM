package PrimerBloque.Tema8

fun main(parameter: Array<String>) {

    println("Enter 3 numbers")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()


    if (num1 == num2 && num1 == num3) {
        val cube = num1 * num2 * num3
        println("You put 3 equals numbers and his cube is: $cube")
    }

}