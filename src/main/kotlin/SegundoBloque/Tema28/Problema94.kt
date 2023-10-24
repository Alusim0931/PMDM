package SegundoBloque.Tema28

data class Person(var name: String, var age: Int) {
    override fun toString(): String {
        return "$name, $age"
    }
}
fun main() {
    var person1 = Person("Juan", 22)
    var person2 = Person("Ana", 59)

    println(person1)
    println(person2)
}