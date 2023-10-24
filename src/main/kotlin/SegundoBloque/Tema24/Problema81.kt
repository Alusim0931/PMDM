package SegundoBloque.Tema24

class Person constructor(name: String, age: Int) {
    var name: String = name
    var age: Int = age

    fun print() {
        println("$name has an age of $age")
    }

    fun isGreater() {
        if (age >= 18) {
            println("It's an adult $name")
        } else {
            println("No it's an adult $name")
        }
    }
}

fun main() {
    var person1 = Person("Juan", 18)
    person1.print()
    person1.isGreater()
}