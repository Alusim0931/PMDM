package TercerBloque.Tema42

fun main() {
    var list1: MutableList<Int> = MutableList(20) {((Math.random() * 6) + 1).toInt()}

    println("Full list")
    println(list1)

    var quant = list1.count{it == 1}
    println("Quantity with elements with the value 1: $quant")

    list1.removeAll{it == 6}
    println("List after remove the number 6")
    println(list1)
}