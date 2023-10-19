package SegundoBloque.Tema23

class Person {
    var name: String = ""
    var age: Int = 0

    fun init(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun print() {
        println("Name: $name and have an age than $age")
    }

    fun isAdult() {
        if (age >= 18) {
            println("$name It's an adult")
        } else {
            println("$name he/she not is an adult")
        }
    }
}

fun main() {
    var person1: Person
    person1 = Person()
    person1.init("Jorge", 3)
    person1.print()
    person1.isAdult()

    var person2: Person
    person2 = Person()
    person2.init("Anna", 32)
    person2.print()
    person2.isAdult()
}