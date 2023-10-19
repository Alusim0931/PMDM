package PrimerBloque.Tema19

fun table(num: Int, terms: Int = 10) {
    for (i in num..num * terms step num)
        println(i)
}

fun main() {
    println("Table of 3")
    table(3)

    println("Table of 3 with 5 terms")
    table(3,5)

    println("Table of 3 with 20 terms")
    table(3, 20)
}