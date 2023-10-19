package PrimerBloque.Tema22

fun charge(): IntArray {
    println("How many salarys do you wants to charge?: ")
    var quantity = readln().toInt()
    var salary = IntArray(quantity)

    for (i in salary.indices) {
        println("Enter an element: ")
        salary[i] = readln().toInt()
    }
    return salary
}


fun main() {
    var salaries = charge()
    print(salaries)
}