package Tema13

fun main() {
    println("Enter a value positive between 1 and 99999")
    var value = readln().toInt()

    when (value) {
        in 1..9 -> println("The value have one digit")
        in 10 ..99 -> println("The value have two digits")
        in 100..999 -> println("The value have three digits")
        in 1000..9999 -> println("The value have four digits")
        in 10000..99999 -> println("The value have five digits")

        else -> println("Value out of range")
    }
}