package SegundoBloque.Tema29

enum class TypeCard {
    DIAMOND,
    CLOVER,
    HEARTH,
    PICA
}

class Card(var type: TypeCard, var valor: Int) {

    fun print() {
        println("Card: $type and his valor is $valor")
    }
}

fun main() {
    var card1 = Card(TypeCard.CLOVER, 4)
    card1.print()
}