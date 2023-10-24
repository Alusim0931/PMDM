package TercerBloque.Tema42

fun charge(): Int {
    println("Enter a value: ")
    var value = readln().toInt()
    return value
}

fun main() {
    var list1: List<Int> = List(5, { charge()})
    println(list1)
}