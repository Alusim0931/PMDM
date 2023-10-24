package SegundoBloque.Tema27

class Dice(valor: Int) {
    var valor: Int = 1
        set(valor) {
            if (valor >= 1 && valor <= 6) {
                field = valor
            }else {
                field = 1
            }
        }
        init {
            this.valor = valor
        }
    fun trhow() {
        valor = ((Math.random() * 6) + 1).toInt()
    }

    fun print() {
        println("Valor of the Dice: $valor")
    }
}

fun main() {
    var dice1 = Dice(7)
    dice1.print()
    dice1.trhow()
    dice1.print()

}