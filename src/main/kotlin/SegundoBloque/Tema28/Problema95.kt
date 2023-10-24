package SegundoBloque.Tema28

data class Dice(var valor: Int) {
    override fun toString(): String {
        var chain = ""
        for (i in 1..valor) {
            chain = chain + "*"
        }
        return chain
    }
}

fun main() {
    var dice1 = Dice(4)
    var dice2 = Dice(6)
    var dice3 = Dice(1)

    println(dice1)
    println(dice2)
    println(dice3)
}