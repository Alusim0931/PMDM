package PrimerBloque.Tema10

fun main() {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0

    do {
        println("Enter the height of the piece (0 for finish)")
        val height = readln().toInt()

        if (height > 10.2) {
            cant1++
        } else if (height >= 9.8){
            cant2++
        } else if (height > 0) {
            cant3++
        }
    } while(height != 0)

    println("Pieces suitable: $cant2")
    println("Pieces with a superior height than 10.2: $cant1")
    println("Pieces with a minor height than 9.8: $cant3")
}