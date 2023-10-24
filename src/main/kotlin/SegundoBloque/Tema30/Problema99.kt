package SegundoBloque.Tema30

object Matematica {
    val PI = 3.1416
    fun randomize(min: Int, max: Int) = ((Math.random() * (max + 1 -
            min)) + min).toInt()
}
fun main() {
    println("The valor of PI is: ${Matematica.PI}")
    print("A random value between 5 and 10: ")
    println(Matematica.randomize(5, 10))
}
