package Tema21

fun main() {
    var salaries: IntArray
    salaries = IntArray(5)

    for (i in 0..4) {
        println("Enter the salaries: ")
        salaries[i] = readln().toInt()
    }
    for (i in 0..4) {
        println(salaries[i])
    }
}