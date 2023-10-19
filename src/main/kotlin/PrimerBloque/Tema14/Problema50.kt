package PrimerBloque.Tema14

fun presentation() {
    println("Program that allows you to enter two values: \n")
    println("Make the sum")
    println("Print the result")
    println("---------------------------------------------------------")
}

fun chargeSum() {
    println("Write the two values")
    var value1 = readln().toInt()
    var value2 = readln().toInt()

    var sum = value1 + value2

    println("The result of the sum is: $sum")
}

fun finish() {
    println("Thanks for using the program")
    println("************************************************************")
}

fun main() {
    presentation()
    chargeSum()
    finish()
}