package Tema14

fun calcSquare() {
    println("Enter one value: ")
    var value = readln().toInt()
    var square = value * value

    println("The square is: $square")
}

fun calcMult() {
    println("Enter two values: ")
    var valueMult1 = readln().toInt()
    var valueMult2 = readln().toInt()

    var result = valueMult1 * valueMult2

    println("The product is: $result")
}

fun main() {
    calcSquare()
    separation()
    calcMult()
}