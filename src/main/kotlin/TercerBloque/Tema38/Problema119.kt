package TercerBloque.Tema38

fun main() {
    var vector1 = IntArray(10)
    for (i in vector1.indices) {
        vector1[i] = ((Math.random() * 100)).toInt()
    }
    println("impression of the entire arrangement")
    for (element in vector1) {
        println("$element")
    }
    println()

    var quantity = 0
    vector1.forEach {
        if(it % 3 == 0) {
            quantity++
        }
    }
    println("The number of elements multiples of 3 are: $quantity")
    var sum = 0
    vector1.forEach {
        if (it > 50) {
            sum += it
        }
    }
    println("The sum of the numbers greater than 50 are: $sum")
}