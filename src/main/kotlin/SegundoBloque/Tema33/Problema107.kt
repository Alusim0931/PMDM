package SegundoBloque.Tema33

interface Point {
    fun print()
}

class FlatPoint(var pointX: Int, var pointY: Int): Point {
    override fun print() {
        println("Point in flat: $pointX, $pointY")
    }
}

class SpacePoint(var SpaceX: Int, var SpaceY: Int, var SpaceZ: Int ): Point {
    override fun print() {
        println("Point in the space: $SpaceX, $SpaceY, $SpaceZ ")
    }
}

fun main() {
    val flatPoint1 = FlatPoint(2, 1)
    flatPoint1.print()
    println("\t")
    val spacePoint1 = SpacePoint(3,4,5)
    spacePoint1.print()
}