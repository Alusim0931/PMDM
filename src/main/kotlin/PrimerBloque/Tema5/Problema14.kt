package PrimerBloque.Tema5

fun main(parameter: Array<String>) {
    println("Insert a number")
    var num = readln().toInt()

    if(num > 9) {
        println("The number have 2 digits")
    }else{
        println("The number have 1 digit")
    }
}