package Tema5

fun main(parameter: Array<String>) {

    println("Write two numbers")
    var val1 = readln().toInt()
    var val2 = readln().toInt()

    if (val1 > val2){
        println("The $val1 is greater than $val2")
    }else{
        println("The $val2 is greater than $val1")
    }
}