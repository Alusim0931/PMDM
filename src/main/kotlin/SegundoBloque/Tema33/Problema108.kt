package SegundoBloque.Tema33

interface Figure {
    fun calcSurface(): Int
    fun calcPerimter(): Int
    fun titleResult() {
        println("Information of the figure: ")
    }
}

class Square(var side: Int): Figure {
    override fun calcSurface(): Int {
        return side * side
    }

    override fun calcPerimter(): Int {
        return side * 4
    }
}

class Rectangle(var greaterSide: Int, var minorSide: Int): Figure {
    override fun calcSurface(): Int {
        return greaterSide * minorSide
    }

    override fun calcPerimter(): Int {
        return (greaterSide * 2) + (minorSide * 2)
    }
}

fun main() {
    var square1 = Square(10)
    square1.titleResult()
    println("Surface of the square: ${square1.calcSurface()}")
    println("Perimeter of the square: ${square1.calcPerimter()}")

    println("\t")

    var rectangle1 = Rectangle(10, 5)
    rectangle1.titleResult()
    println("Surface of the rectangle: ${rectangle1.calcSurface()}")
    println("Perimeter of the rectangle: ${rectangle1.calcPerimter()}")
}