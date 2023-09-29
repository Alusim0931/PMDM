package Tema6

fun main(parameter: Array<String>){
    println("Introduce one number")

    var num = readln().toInt()

    val result = if (num % 2 == 0){
        println("Square: ")
        num * num
    } else {
        println("Cub")
        num * num * num
    }
    println("The result is $result")
}