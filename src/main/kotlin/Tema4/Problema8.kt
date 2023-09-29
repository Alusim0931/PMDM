package Tema4
fun main(parameter: Array<String>){

    println("Write the 2 numbers")
    val val1 = readLine()!!.toInt()
    val val2 = readLine()!!.toInt()

    val sum = val1 + val2
    println("The result of the sum is $sum")

    println("------------------------------------")

    println("Write 2 numbers more")
    val val3 = readLine()!!.toInt()
    val val4 = readLine()!!.toInt()

    val mult = val3 + val4
    println("The result of the mult is $mult")

}