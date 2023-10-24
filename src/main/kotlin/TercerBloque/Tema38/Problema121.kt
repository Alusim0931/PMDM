package TercerBloque.Tema38

class Dice (var value: Int = 1) {
    fun throws() {
        value = ((Math.random() * 6) + 1).toInt()
    }

    fun print() {
        println("Value of the dice: $value")
    }
}

fun main() {
    var dices: Array<Dice> = arrayOf(Dice(), Dice(), Dice(), Dice(), Dice())

    for (dice in dices) {
        dice.throws()
    }
    for (dice in dices) {
        dice.print()
    }

    var quant1 = 0
    var quant2 = 0
    var quant3 = 0
    var quant4 = 0
    var quant5 = 0
    var quant6 = 0

    dices.forEach {
        when (it.value) {
            1 -> quant1++
            2 -> quant2++
            3 -> quant3++
            4 -> quant4++
            5 -> quant5++
            6 -> quant6++
        }
    }
    println("Quantity of dices who have the valor 1: $quant1")
    println("Quantity of dices who have the valor 2: $quant2")
    println("Quantity of dices who have the valor 3: $quant3")
    println("Quantity of dices who have the valor 4: $quant4")
    println("Quantity of dices who have the valor 5: $quant5")
    println("Quantity of dices who have the valor 6: $quant6")

}