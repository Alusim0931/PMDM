package TercerBloque.Tema42

fun main() {
    var list1: List<String> = listOf("Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    println("Print the complete list")
    println(list1)

    println("Print the first element of the list")
    println(list1[0])

    println("Print the first element of the list with .first")
    println(list1.first())

    println("Print the last element of the list")
    println(list1[6])

    println("Print the last element of the list with .last")
    println(list1.last())

    println("Print the last element of the list with [list1.size-1]")
    println(list1[list1.size-1])

    println("Print the size of the list")
    println(list1.size)

    println("Scroll through the entire list with a for")

    for (element in list1) {
        println("$element")
    }
    println()

    println("Print the element and his position")

    for (position in list1.indices) {
        println("[$position]${list1[position]}")
    }

}