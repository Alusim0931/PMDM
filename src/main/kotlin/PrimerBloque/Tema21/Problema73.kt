package PrimerBloque.Tema21

fun main() {
    var vector = IntArray(10)
    for(i in 0..vector.size - 1) {
        println("Enter an element: ")
        vector[i] = readln().toInt()
    }
    var tidy = true
    for (i in 0..vector.size - 2) {
        if (vector[i + 1] < vector[i]) {
            tidy = false
        }
        if (tidy) {
            println("The elements are tidy by smallest to largest")
        }else {
            println("The element ere tidy by largest and smallest")
        }
    }
}