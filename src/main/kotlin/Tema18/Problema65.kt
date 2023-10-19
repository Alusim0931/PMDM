package Tema18

fun titleUnderlined(title: String, character: String = "*") {
    println(title)
    for (i in 1..title.length) {
        print(character)
        println()
    }
}

fun main() {
    titleUnderlined("Administration title")
    titleUnderlined("Sales", "-")
}