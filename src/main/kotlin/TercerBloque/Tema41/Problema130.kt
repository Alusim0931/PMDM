package TercerBloque.Tema41

fun sum(vararg num: Int): Int {
    var sum = 0

    for (element in num) {
        sum += element
    }
    return sum
}

fun main() {
    var total = sum(10,20,30,40,50)
    println(total)
}