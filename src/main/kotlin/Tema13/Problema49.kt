package Tema13

fun main() {
    var quant1 = 0
    var quant2 = 0

    for (i in 1..10) {
        println("Enter the value: ")
        var value = readln().toInt()

        when(value) {
            0 -> quant1++
            1, 5, 10 -> quant2++
        }
    }
    println("Quantity of 0: $quant1")
    println("Quantity of numbers 1, 5 or 10: $quant2")
}