package SegundoBloque.Tema25

import java.awt.PageAttributes

class Partner(var name: String, var antiquity: Int) {

    fun print() {
        println("$name has an antiquity of: $antiquity")
    }
}

class Club {
    var partner1 = Partner("Fran", 8)
    var partner2 = Partner("Manolo", 1)
    var partner3 = Partner("Ana", 3)

    fun greaterAntiquity() {
        partner1.print()
        partner2.print()
        partner3.print()

        println("Partner with greater antiquity: ")
        when {
            partner1.antiquity > partner2.antiquity && partner1.antiquity > partner3.antiquity -> println(partner1.name)
            partner2.antiquity > partner3.antiquity -> println(partner2.name)
            else -> println(partner3.name)
        }
    }
}

fun main() {
    val club1 = Club()
    club1.greaterAntiquity()
}