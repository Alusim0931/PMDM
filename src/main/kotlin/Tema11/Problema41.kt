package Tema11

fun main() {
    var mult3 = 0
    var mult5 = 0
    var mult9 = 0

    for (i in 1..10000) {
        if (i % 3 == 0) {
            mult3++
        }
        if (i % 5 == 0) {
            mult5++
        }
        if (i % 9 == 0) {
            mult9++
        }
    }
    println("Number of multiples of 3: $mult3")
    println("Number of multiples of 5: $mult5")
    println("Number of multiples of 9: $mult9")
}