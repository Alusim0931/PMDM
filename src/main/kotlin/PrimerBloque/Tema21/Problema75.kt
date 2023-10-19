package PrimerBloque.Tema21

fun main() {
    var valor = IntArray(10)
    for (i in valor.indices) {
        println("Enter an element: ")
        valor[i] = readln().toInt()
    }
    for (elment in valor) {
        println(elment)
    }
}