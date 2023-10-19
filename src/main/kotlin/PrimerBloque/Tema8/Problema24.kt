package PrimerBloque.Tema8

fun main(parameter: Array<String>) {
    println("Introduce 3 numbers")
    var num1 = readln().toInt()
    var num2 = readln().toInt()
    var num3 = readln().toInt()

    if(num1 > num2 && num1 > num3) {
        println("The greater number are $num1")
    }else if (num2 > num1 && num2 > num3) {
        println("The greater number are $num2")
    }else {
        println("The greater number are $num3")
    }
}