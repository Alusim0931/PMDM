package Tema20

fun multiplies2_5() {
    fun multiplie(num: Int, valor: Int) = num % valor == 0

    var mult2 = 0
    var mult5 = 0

    for (i in 1..10) {
        print("Enter a value: ")
        val input = readLine()
        if (input != null) {
            val value = input.toIntOrNull()
            if (value != null) {
                if (multiplie(value, 2)) {
                    mult2++
                }
                if (multiplie(value, 5)) {
                    mult5++
                }
            } else {
                println("Invalid input. Please enter a valid number.")
            }
        } else {
            println("Error reading input.")
        }
        println("Number of multiplies of two: $mult2")
        println("Number of multiplies of five: $mult5")
    }
}

fun main() {
    multiplies2_5()
}
