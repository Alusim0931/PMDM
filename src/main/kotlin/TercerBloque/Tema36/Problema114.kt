package TercerBloque.Tema36

fun operate(valor1: Int, valor2: Int, fn:(Int, Int) -> Int): Int {
    return fn(valor1,valor2)
}

fun main() {
    var sum = operate(2,3,{x, y -> x + y})
    println(sum)

    var substraction = operate(3, 2, {x, y -> x - y})
    println(substraction)

    var elevateFourth = operate(2,4, {x, y ->
        var valor = 1
        for (i in 1..y)
            valor = valor * x
            valor
    })
    println(elevateFourth)
}