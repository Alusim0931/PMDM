package PrimerBloque.Tema16

fun returnAverage(v1: Int, v2: Int, v3: Int): Int {
    val average = (v1 + v2+ v3)/3
    return average
}

fun main() {
    println("Enter 3 numbers: ")
    var num1 = readln().toInt()
    var num2 = readln().toInt()
    var num3 = readln().toInt()

    println("The average of the numbers $num1, $num2 and $num3 is ${returnAverage(num1, num2, num3)}")
}