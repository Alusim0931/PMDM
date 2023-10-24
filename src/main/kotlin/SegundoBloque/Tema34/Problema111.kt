package SegundoBloque.Tema34

class Dice(var valor: Int = 1) {
    fun throws() {
        valor = ((Math.random() * 6) + 1).toInt()
    }

    fun print() {
        println("Valor of the dice: $valor")
    }
}

fun main() {
    var dices: Array<Dice> = arrayOf(Dice(), Dice(), Dice(), Dice(), Dice())

    for(dice in dices) {
        dice.throws()
    }
    for (dice in dices) {
        dice.print()
    }
}