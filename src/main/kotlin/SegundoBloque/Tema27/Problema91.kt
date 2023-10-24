package SegundoBloque.Tema27

class Employee(var name: String, salary: Double) {
    var salary: Double = 0.0
        set(valor) {
            if (valor < 0) {
                field = 0.0
            }else {
                field = valor
            }
        }
    init {
        this.salary = salary
    }

    fun print() {
        println("$name has a salary of $salary")
    }
}

fun main() {
    var employee1 = Employee("Juan", 1200.50)
    employee1.print()
    var employee2 = Employee("Raquel", 1450.75)
    employee2.print()

}