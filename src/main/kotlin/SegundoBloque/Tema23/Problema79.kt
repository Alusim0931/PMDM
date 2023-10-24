package SegundoBloque.Tema23

class Triangle {
    var side1: Int = 0
    var side2: Int = 0
    var side3: Int = 0

    fun initialize() {
        println("Enter the 3 sides: ")
        side1 = readln().toInt()
        side2 = readln().toInt()
        side3 = readln().toInt()
    }

    fun greaterSide() {
        println("Greater side: ")
        when {
            side1 > side2 && side1 > side3 -> println("Greater side: $side1")
            side2 > side3 -> println("Greater side: $side2")
            else -> println("Greater: $side3")
        }
    }

    fun isEquilater() {
        if (side1 == side2 && side1==side3) {
            println("Is equilater")
        } else {
            println("Not is equilater")
        }
    }
}

fun main() {
    var triangle1 = Triangle()
    triangle1.initialize()
    triangle1.greaterSide()
    triangle1.isEquilater()
}