package PrimerBloque.Tema11

fun main() {
    var sum = 0
    for (i in 1..10) {
        println("Enter a number")
        val number = readln().toInt()
        sum += number
    }
    println("The sum of the numbers is $sum")
    val average = sum / 10
    println("The average is $average")
}