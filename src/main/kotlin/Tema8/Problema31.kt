package Tema8

fun main() {
    println("Enter 2 numbers greater than 0")

    val coordX = readln().toInt()
    val coordY = readln().toInt()

    if (coordX > 0 && coordY > 0) {
        println("You are un quadrant 1")
    } else if (coordX < 0 && coordY > 0) {
        println("You are in quadrant 2")
    } else if (coordX < 0 && coordY < 0) {
        println ("You are in the 3 quadrant")
    } else if(coordX > 0 && coordY < 0) {
        println("You are in the 4 quadrant")
    }else {
        println("You dont have coords")
    }

}