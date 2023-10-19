package Tema20

fun showGreater() {
    fun greater(valor1: Int, valor2: Int) = if (valor1 > valor2) valor1 else valor2

    for (i in 1..5) {
        println("Enter two values: ")
        var val1 = readln().toInt()
        var val2 = readln().toInt()
        println("The greater betweem $val1 and $val2 is ${greater(val1, val2)}")
    }
}

fun main() {
    showGreater()
}