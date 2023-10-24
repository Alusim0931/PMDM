package TercerBloque.Tema36

import SegundoBloque.Tema26.Vector

fun printYes(vector: IntArray, fn:(Int) -> Boolean) {
    for (element in vector) {
        if (fn(element)) {
            println("$element")
        println()
        }
    }
}

fun main() {
    var vector1 = IntArray(10)
    for (i in vector1.indices) {
        vector1[i] = ((Math.random() * 100)).toInt()
    }
    println("Print the values multiples of 2")
    printYes(vector1) {x -> x % 2 == 0}
    println("Print the values multiples of 3 or 5")
    printYes(vector1) {x -> x % 3 == 0 || x % 5 == 0}
    println("Print the values greater or equals to 50")
    printYes(vector1) {x -> x >= 50}
    println("Print the values between 1 and 10, 20 and 30, 90 and 95")
    printYes(vector1) {x -> when(x) {
        in 1..10 -> true
        in 20..30 -> true
        in 90..95 -> true
        else -> false
        }}
    println("Print all values")
    printYes(vector1) {x -> true}
}
