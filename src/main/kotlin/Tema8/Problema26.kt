package Tema8

fun main(parameter: Array<String>) {
    println("Introduce day, month and year")
    var day = readln().toInt()
    var month = readln().toInt()
    var year = readln().toInt()

    if(month == 1 || month == 2 || month == 3){
        println("Is the first trimester")
    }else {
        println("Is another trimester")
    }
}