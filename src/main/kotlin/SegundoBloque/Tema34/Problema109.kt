package SegundoBloque.Tema34

class Person(var name: String, var age: Int) {
    fun print() {
        println("Name: $name")
        println("Age: $age")
    }

    fun itsAdult() = if (age >= 18)true else false
    }

    fun main() {
        var people: Array<Person> = arrayOf(
            Person("Ana", 27), Person("Juan", 34),
            Person("Raul", 20), Person("Jordi", 6)
        )
        println("List of people")
        for (peop in people) {
            peop.print()
        }
        var quantity = 0
        for (peop in people) {
            if (peop.itsAdult()) {
                quantity++
            }
        }
        println("Quantity of people adults: $quantity")
    }