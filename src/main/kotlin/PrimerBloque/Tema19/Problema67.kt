package PrimerBloque.Tema19

fun calculateSalary(name: String, costHour: Double,cantityHour: Int ) {
    var salary = costHour * cantityHour
    println("$name worked $cantityHour hours, he is paid hourly $costHour, therefore he receives a salary of $salary")
}

fun main() {
    calculateSalary("Pedro", 10.5, 120)
    calculateSalary(costHour = 12.0, cantityHour = 40, name = "Ana")
    calculateSalary(cantityHour = 90, name = "Luis", costHour = 7.25)
}