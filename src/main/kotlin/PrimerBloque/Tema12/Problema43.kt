package PrimerBloque.Tema12

fun main() {
    println("Enter the coord x: ")
    var coordX = readln().toInt()
    println("Enter the coord y: ")
    var coordY = readln().toInt()

    when {
        coordX > 0 && coordY > 0 -> println("First quadrant")
        coordX > 0 && coordY < 0 -> println("Second quadrant")
        coordX < 0 && coordY > 0 -> println("Third quadrant")
        coordX < 0 && coordY < 0 -> println("Forth quadrant")
        else -> println("The point is in a axis")
    }
}