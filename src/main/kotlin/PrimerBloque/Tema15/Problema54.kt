package PrimerBloque.Tema15

fun mostrarMensaje(mesage: String) {
    println("**************************")
    println(mesage)
    println("***************************")
}

fun valueCharges() {
    println("Write two values: ")
    var num1 = readln().toInt()
    var num2 = readln().toInt()

    var sum = num1 + num2

    println("The result is: $sum")
}

fun main() {
    mostrarMensaje("This program calculate the sum of the two values introduceced")
    valueCharges()
    mostrarMensaje("Thanks for using the program")
}

