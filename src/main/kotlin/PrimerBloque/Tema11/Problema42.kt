package PrimerBloque.Tema11

fun main() {
    var quant = 0
    println("How many values do you want to analyze: ")
    var quantity = readln().toInt()

    for (i in 1..quantity) {
        println("Enter a number: ")
        val number = readln().toInt()

        if(number % 2 == 0) {
            quant++
        }

    }
    println("Quantity of evens: $quant")
}