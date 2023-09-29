package Tema10

fun main() {
    var cant = 0
    var sum = 0

    do {
        println("Enter one number (0 for finish)")
        val number = readln().toInt()

        if (number != 0) {

            sum += number
            cant++
        }
    } while (number != 0)
    if (cant != 0){
        val average = sum / cant
        println("The average of numbers is $average")
    } else {
        println("No numbers")
    }
}