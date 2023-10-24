package SegundoBloque.Tema31

open class Person(var name: String, var age: Int) {
    open fun print (){
        println("Name: $name")
        println("Age: $age")
    }
}

class Employee(name: String, age: Int, var salary: Double):
        Person(name, age) {
    override fun print() {
        super.print()
        println("Salary: $salary")
    }

    fun payTaxe() {
        if (salary > 3000) {
            println("The employee $name pay taxes")
        } else {
            println("The employee $name don't pay taxes")
        }
    }

}
    fun main() {
        var person1 = Person("Juan", 23)
        println("Person Information: ")
        person1.print()

        println("--------------------------------------------------------")

        var employee = Employee("Ana", 30, 5000.0)
        println("Person Information")
        employee.print()
        employee.payTaxe()

    }
