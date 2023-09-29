package Tema4

fun main(parameter: Array<String>){

    println("Introduce 4 numbers")
    var val1 = readln().toInt()
    var val2 = readln().toInt()
    var val3 = readln().toInt()
    var val4 = readln().toInt()

    val result = (val1 + val2 + val3 + val4) / 2

    println("The average is $result")

}