package SegundoBloque.Tema24

class Operations {
    var num1: Int = 0
    var num2: Int = 0

    fun charge() {
        println("Enter the values: ")
        num1 = readln().toInt()
        num2 = readln().toInt()
        sum()
        rest()
    }

    fun sum() {
        var sum = num1 + num2
        println("The sum of $num1 and $num2 is $sum")
    }

    fun rest() {
        var rest = num1 - num2
        println("The rest of $num1 and $num2 is $rest")
    }
}

fun main() {
    var operations1 = Operations()
    operations1.charge()
}