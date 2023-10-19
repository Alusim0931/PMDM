package PrimerBloque.Tema9

fun main() {
    println("Enter a positive number: ")
    var positiveNum = readln().toInt()
    var num = 1

    while (num <= positiveNum) {
        println(num)

        num = num + 1
    }


}