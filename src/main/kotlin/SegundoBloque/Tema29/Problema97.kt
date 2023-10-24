package SegundoBloque.Tema29

import SegundoBloque.Tema26.Operations

enum class TypeOperation(var type: String) {
    SUM("+"),
    REST("-"),
    MULTIPLICATION("*"),
    DIVISION("/")
}

class Operation(var valor1: Int, var valor2: Int, var typeOperation: TypeOperation) {

    fun operate() {
        var result: Int = 0

        when(typeOperation) {
            TypeOperation.SUM -> result = valor1 + valor2
            TypeOperation.REST -> result = valor1 - valor2
            TypeOperation.MULTIPLICATION -> result = valor1 * valor2
            TypeOperation.DIVISION -> result = valor1 / valor2
        }
        println("$valor1 ${typeOperation.type} $valor2 = $result")
    }
}

fun main() {
    var operation1 = Operation(10,4, TypeOperation.SUM)
    operation1.operate()
}