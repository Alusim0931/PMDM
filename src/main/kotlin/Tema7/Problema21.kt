package Tema7

fun main(parameter: Array<String>) {
    println("Enter 1 number")

    var num = readln().toInt()

    if (num > 0) {
        println("It's Positive!!")
    }else {
        println("It's Negative!!")
    }
}