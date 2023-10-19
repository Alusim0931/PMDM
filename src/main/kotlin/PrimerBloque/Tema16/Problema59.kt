package PrimerBloque.Tema16

fun large (name: String): Int {
    return name.length
}

fun main() {
    println("Enter two names: ")
    var name1 = readln()!!
    var name2 = readln()!!

    if (large(name1) == large(name2)) {
        println("$name1 and $name2 have the same characters")
    } else if (large(name1) > large(name2)) {
        println("$name1 have more characters than $name2")
    }else {
        println("$name2 have more characters than $name1")
    }

}