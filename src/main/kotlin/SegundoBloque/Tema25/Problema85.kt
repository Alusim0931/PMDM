package SegundoBloque.Tema25

class Dice (var valor: Int) {
    fun trhow() {
        valor = ((Math.random()*6)+1).toInt()
        print()
    }
    fun print() {
        println("Valor of the dice: $valor")
    }
}

class diceGame {
    var dice1 = Dice(1)
    var dice2 = Dice(1)
    var dice3 = Dice(1)


    fun play() {
        dice1.trhow()
        dice2.trhow()
        dice3.trhow()

        if (dice1.valor == dice2.valor && dice2.valor==dice3.valor) {
            println("Won")
        } else {
            println("Lose")
        }
    }

}

fun main() {
    var play1 = diceGame()
    play1.play()

}