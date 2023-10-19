package PrimerBloque.Tema12

fun main() {
    var total = 0
    for (i in 1..10) {
        println("Enter the salary: ")
        var salary = readln().toInt()
        total += when {
            salary > 5000 ->{
                println("High salary:")
                salary
            }
            salary > 2000 -> {
                println("Mid salary")
                0
            }
            else -> {
                println("Lower salary")
                0
            }
        }
    }
}