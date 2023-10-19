package Tema15

fun showPerimeter(side: Int) {
    var perimeter = side * 4
    println("El perímetro es: $perimeter")
}

fun showSurface(side: Int) {
    var surface = side * side
    println("La superficie es: $surface")
}

fun main() {
    println("Enter the length of one side of the square: ")
    var num1 = readLine()!!.toInt()

    println("Do you want to calculate the perimeter or the area? [enter text: perimeter/area] ")
    var answer = readLine()!!

    when(answer) {
        "perimeter" -> showPerimeter(num1)
        "surface" -> showSurface(num1)
        else -> println("Invalid option")
    }
}
