package TercerBloque.Tema40

class Dice() {
    var repair = IntArray(10)

    fun throws() {
        for (i in repair.indices) {
            repair[i] = ((Math.random() * 6) + 1).toInt()
        }
    }

    operator fun invoke(nro: Int) = repair[nro]

}

fun main() {
    var dices = Dice()
    dices.throws()
    println(dices(0))
    println(dices(1))

    for (i in 2..9) {
        println(dices(i))
    }
}