package Tema4
fun main(parametro: Array<String>){

    println("Insert first valor")
    val valor1 = readLine()!!.toInt()

    println("Insert second valor")
    val valor2 = readLine()!!.toInt()

    val sum = valor1 + valor2
    println("The result of sum is $sum")

    val mult = valor1 * valor2
    println("The result of multiplication is $mult")
}
