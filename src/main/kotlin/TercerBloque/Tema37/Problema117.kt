package TercerBloque.Tema37

fun main() {
    var vector = IntArray(20) {(Math.random() * 11).toInt()}
    println("Complete list of the Array")
    for (element in vector) {
        println("$element")
    }
    println()
    var quant1 = vector.count() {it <= 5}
    println("Quantitiy of elements minors or equals to 5: $quant1")
    if (vector.all{it <= 9}) {
        println("All elements are minor or equal to 9")
    } else {
        println("Not all elements are minor or equal to 9")
    }
    if(vector.any{it == 10}) {
        println("At least one of the elements is a 10")
    } else {
        println("All elements are different than 10")
    }
}