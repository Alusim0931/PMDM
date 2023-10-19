package PrimerBloque.Tema14

fun sumCharge() {
    println("Write the two values: ")
    var num1 = readln().toInt()
    var num2 = readln().toInt()

    var sumResult = num1 + num2

    println("The sum of the values is: $sumResult \n")
}

fun separation() {
    println("******************************************** \n")
}

fun main() {
    for (i in 1..5) {
        sumCharge()
    }
}