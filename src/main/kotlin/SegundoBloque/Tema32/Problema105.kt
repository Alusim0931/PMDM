package SegundoBloque.Tema32

import PrimerBloque.Tema18.sum

abstract class Operation(var valor1: Int, var valor2: Int) {
    protected var result: Int = 0

    abstract fun operate ()

    fun print() {
        println("Result: $result")
    }
}

class Sum(valor1: Int, valor2: Int): Operation(valor1, valor2) {
    override fun operate() {
        result = valor1 + valor2
    }
}

class Rest(valor1: Int, valor2: Int): Operation(valor1, valor2) {
    override fun operate() {
        result = valor1 - valor2
    }
}

fun main() {
    var sum1 = Sum(15, 5)
    println("The sum of 15 + 5 is: ")
    sum1.operate()
    sum1.print()
    println("\t")
    var rest1 = Rest(15, 5)
    println("The rest of 15 - 5 is: ")
    rest1.operate()
    rest1.print()


}