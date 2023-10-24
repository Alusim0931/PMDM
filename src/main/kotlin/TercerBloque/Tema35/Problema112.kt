package TercerBloque.Tema35

fun operate (valor1: Int, valor2: Int, fn: (Int, Int) -> Int): Int {
    return fn (valor1, valor2)
}

fun sum (valorX: Int, valorY: Int) = valorX + valorY
fun substract (valorX: Int, valorY: Int) = valorX - valorY
fun multiplication (valorX: Int, valorY: Int) = valorX * valorY
fun division (valorX: Int, valorY: Int) = valorX / valorY

fun main() {
    var result1 = operate(10, 5,::sum)
    println("10 + 5 = $result1")

    var result2 = operate(5, 2,::sum)
    println("5 + 2 = $result2")

    println("100 - 50 = ${operate(100, 50,::substract)}")

    println("100 * 5 = ${operate(100, 5, ::multiplication)}")

    println("100 / 5 = ${operate(100, 5, ::division)}")
}