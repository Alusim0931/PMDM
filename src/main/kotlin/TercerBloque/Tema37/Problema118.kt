package TercerBloque.Tema37

fun main() {
    var vector = FloatArray(10)
    for (i in vector.indices) {
        println("Enter an element: ")
        vector[i] = readln().toFloat()
    }
    println("Full list of repairment")
    for (element in vector) {
        println("$element")
    }
    println()
    var quantity = vector.count {it < 50}
    println("Number of values entered less than 50: $quantity")
    if(vector.all{it < 50}) {
        println("All the values are minor than 50")
    }else {
        println("Not all the values are minor than 50")
    }



}