package PrimerBloque.Tema21

fun main() {
    var array = IntArray(10)
    for (i in array.indices) {
        println("Enter an element: ")
        array[i] = readln().toInt()
    }
    println("First component of arrangement ${array[0]}")
    println("Last component of arrangement ${array[array.lastIndex]}")
}