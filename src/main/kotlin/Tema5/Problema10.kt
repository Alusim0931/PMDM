package Tema5

fun main(parameter: Array<String>){

    println("Introduce the salary")
    var salary = readln().toDouble()

    if (salary > 3000) {
        println("You have to pay taxes")
    }else{
        println("You dont have to pay taxes")
    }
}