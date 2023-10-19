package PrimerBloque.Tema18

fun sum(v1: Int, v2: Int, v3: Int = 0, v4: Int = 0, v5: Int = 0) = v1 + v2 + v3+ v4+ v5

fun main() {
    println("The sum of 5 + 6 is ${sum(5,6)}")
    println("The sum of 1 + 2 + 3 is ${sum(1,2,3)}")
    println("The sum of 1 + 2 + 3 + 4 + 5 is ${sum(1, 2, 3, 4, 5)}")
}