package TercerBloque.Tema42

fun main() {
    val ages: MutableList<Int> = mutableListOf(23,67,12,35,12)
    println("List of ages: ")
    println(ages)

    ages[0] = 60
    println("Complete list before modify the fist age")
    println(ages)

    println("First age stored in the list")
    println(ages[0])

    println("Average of ages")
    println(ages.average())

    println("Adding one age at the end of the list")
    ages.add(50)
    println(ages)

    println("Adding one age at the beginning")
    ages.add(0, 14)

    println("Deleting the first age in the list")
    ages.removeAt(0)
    println(ages)

    println("Quantity of adults")
    var quant = ages.count() {it >= 18}
    println(quant)

    ages.removeAll{it == 12}
    println("List of age after delete people with 12 years old")
    println(ages)

    ages.clear()
    println("List after delete all elements in the list")
    println(ages)

    if (ages.isEmpty()) {
        println("No ages stored")
    }

}