package PrimerBloque.Tema10

fun main() {
    do {
        println("Enter one number between 0 and 99")
        val number = readln().toInt()
        if (number < 10) {
            println("The number has one digit")
        }else if (number < 100) {
            println("The number has two digits")
        } else {
            println("The number has three digits")
        }
    } while (number != 0)
}