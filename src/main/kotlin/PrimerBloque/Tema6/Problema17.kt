package PrimerBloque.Tema6

fun main(parameter: Array<String>){
    println("Introduce one number")
    var num = readln().toInt()

    var quantity = if (num < 10) 1 else 2
    println("The number $num have $quantity")
}