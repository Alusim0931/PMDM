package SegundoBloque.Tema30

object greater {
    fun maxInt(num1: Int, num2: Int) = if (num1 > num2) num1 else num2
    fun maxFloat(num1: Float, num2: Float) = if (num1 > num2) num1 else num2
    fun maxDouble(num1: Double, num2: Double) = if (num1 > num2) num1 else num2
}

fun main() {
    println(greater.maxInt(3, 4))
    println(greater.maxDouble(1.1, 0.1))
    println(greater.maxFloat(2f, 3f))
}