package SegundoBloque.Tema31

open class Calculator(var valor1: Double, var valor2: Double) {
    var result: Double = 0.0

    fun sum() {
        result = valor1 + valor2
    }

    fun substraction() {
        result = valor1 - valor2
    }

    fun multiplication() {
        result = valor1 * valor2
    }

    fun division() {
        result = valor1 / valor2
    }

    fun print() {
        println("The result is: $result")
    }
}

class ScienceCalculator(valor1: Double, valor2: Double):
        Calculator(valor1, valor2) {
            fun Square() {
                result = valor1 * valor1
            }

            fun root() {
                result = Math.sqrt(valor1)
            }
        }

fun main() {
    println("Prove class Calculator(Sum of two numbers: )")
    var calculator1 = Calculator(10.0, 2.0)
    calculator1.sum()
    calculator1.print()

    println("--------------------------------------------------------------------------------------------------------")

    println("Prove of the class ScienceCalculator(Sum of two numbers and the square and root of the first value: )")
    var scienceCalculation1 = ScienceCalculator(10.0, 2.0)
    println("\t")
    println("The sum of the values: ")
    scienceCalculation1.sum()
    scienceCalculation1.print()
    println("\t")
    println("The square of the first value: ")
    scienceCalculation1.Square()
    scienceCalculation1.print()
    println("\t")
    println("The root of the value: ")
    scienceCalculation1.root()
    scienceCalculation1.print()


}