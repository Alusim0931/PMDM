package SegundoBloque.Tema27

class Person {
    var name: String = ""
        set(valor) {
            field = valor.toUpperCase()
        }
        get() {
            return "(" + field + ")"
        }

        var age: Int = 0
            set(valor) {
                if (valor >= 0) {
                    field = valor
                } else {
                    field = 0
                }
            }
}

fun main() {
    var person1 = Person()
    person1.name = "Raul"
    person1.age = 20

    println(person1.name + person1.age)
    person1.age = -50
    println(person1.age)
}