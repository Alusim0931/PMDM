package SegundoBloque.Tema31

open class Dice {
    protected var valor: Int = 1

    fun trhow() {
        valor = ((Math.random() * 6) + 1).toInt()
    }

    open fun print() {
        println("$valor")
    }
}

class DiceBox: Dice() {
    override fun print() {
        println("***")
        println("$valor")
        println("***")
    }
}

fun main() {
    var dice1 = Dice()
    dice1.trhow()
    dice1.print()

    var dice2 = DiceBox()
    dice2.trhow()
    dice2.print()
}