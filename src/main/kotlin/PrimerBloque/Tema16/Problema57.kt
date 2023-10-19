package PrimerBloque.Tema16

fun returnSurface (side: Int): Int {
    var surf = side * side
    return surf
}

fun main() {
    println("Enter the side of the square")
    var result = readln().toInt()
    var surface = returnSurface(result)

    println("The surface os the square is $surface")
}