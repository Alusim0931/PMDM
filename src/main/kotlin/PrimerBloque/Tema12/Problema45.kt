package PrimerBloque.Tema12

fun main() {
    var quant1 = 0
    var quant2 = 0
    var quant3 = 0

    do {
        println("Enter the piece height (0 to finish): ")
        var height = readln().toDouble()

        when {
            height > 10.2 -> quant1++
            height >= 9.8 -> quant2++
            height > 0 -> quant3++
        }
    }while (height != 0.0)
    println("Pieces accepted: $quant2")
    println("Pieces with a superior height than 10.2: $quant1")
    println("Pieces with a inferior height than 9.8: $quant3")

    var sum = quant1 + quant2 + quant3
    println("Total pieces processed: $sum")


}