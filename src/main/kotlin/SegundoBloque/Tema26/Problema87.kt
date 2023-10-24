package SegundoBloque.Tema26

class Operations {
    private var num1: Int = 0
    private var num2: Int = 0

    fun charge() {
        println("Enter two numbers: ")
        num1 = readln().toInt()
        num2 = readln().toInt()
        sum()
        rest()
    }

    private fun sum() {
        var sum = num1 + num2
        println("$num1 + $num2 = $sum")
    }

    private fun rest() {
        var rest = num1 - num2
        println("$num1 - $num2 = $rest")
    }
}

fun main() {
    var operate = Operations()
    operate.charge()
}
