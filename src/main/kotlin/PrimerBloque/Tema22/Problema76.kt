package PrimerBloque.Tema22

fun charger(arrangement: IntArray) {
    for (i in arrangement.indices) {
        println("Enter an element")
        arrangement[i] = readLine()!!.toInt()
    }
}

fun print(arrangement: IntArray) {
    for (element in arrangement) {
        println(element)
    }
}

fun main() {
    val arrangement = IntArray(5)
    charger(arrangement)
    print(arrangement)
}
