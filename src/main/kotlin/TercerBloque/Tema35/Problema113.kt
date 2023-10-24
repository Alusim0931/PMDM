package TercerBloque.Tema35

class Person (var name: String, var age: Int) {
    fun isGreater(fn:(Int) -> Boolean): Boolean {
        return fn(age)
    }
}

fun greaterUSA(age: Int): Boolean {
    if (age >= 21) {
        return true
    } else {
        return false
    }
}

fun greaterArgentina(age: Int): Boolean {
    if (age >= 18) {
        return true
    }else {
        return false
    }
}

fun main() {
    var person1 = Person("Juan", 18)
    if (person1.isGreater(::greaterArgentina)) {
        println("${person1.name} it's adult if lives in Argentina")
    } else {
        println("${person1.name} no it is an adult if lives in Argentina")
    }
    if (person1.isGreater (::greaterUSA)) {
        println("${person1.name} it's an adult if lives in USA")
    }else {
        println("${person1.name} no it is an adult if lives in USA")
    }
}