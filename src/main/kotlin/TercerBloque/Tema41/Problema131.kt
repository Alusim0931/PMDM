package TercerBloque.Tema41

enum class Operation {
    SUM,
    AVERAGE
}

fun operate(typeOperation: Operation, vararg repairs: Int): Int {
    when(typeOperation) {
        Operation.SUM -> return repairs.sum()
        Operation.AVERAGE -> return repairs.average().toInt()
    }
}

fun main() {
    var result1 = operate(Operation.SUM, 10,20,30)
    println("The sum is: $result1")
    println("-------------------------------------------------")
    var result2 = operate(Operation.AVERAGE, 10,20,30)
    println("The avarege is: $result2")
}