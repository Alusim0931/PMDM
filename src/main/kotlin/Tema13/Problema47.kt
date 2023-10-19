package Tema13

import java.util.concurrent.ThreadPoolExecutor

fun main() {
    println("Enter the complete value between 1 and 5: ")
    var value = readln().toInt()

    when (value) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")

        else -> println("Value out of range")
    }
}