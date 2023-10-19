package PrimerBloque.Tema17

fun returnSurface(side: Int) = side * side

fun main() {
    println("Enter the side: ")
    var side = readln().toInt()

    println("The surface is ${returnSurface(side)}")
}