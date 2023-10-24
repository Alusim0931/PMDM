package SegundoBloque.Tema26

class Dice {
    private var valor: Int = 1

    fun trhow() {
        valor = ((Math.random() * 6) + 1).toInt()
    }

    fun print() {
        separator()
        println("Valor of the dice: $valor")
        separator()
    }

    private fun separator() {
        println("--------------------------------------------------")
    }
}

fun main() {
    var dice1 = Dice()
    dice1.trhow()
    dice1.print()
}