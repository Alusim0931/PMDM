package TercerBloque.Tema38

class Person (var name: String, var age: Int) {
    fun print() {
        println("Name: $name, Age: $age")
    }

    fun isGreater() = if(age >= 18) true else false
}

fun main() {
    var people: Array<Person> = arrayOf(Person("Ana", 22),
        Person("Juan", 33),
        Person("Carlos", 6),
        Person("Maria", 73))

    println("List of people")
    for (peop in people) {
        peop.print()
    }

    var quant = 0
    people.forEach {
        if (it.isGreater()) {
            quant++
        }
    }
    println("Quantity of people adult: $quant")
}
