package PrimerBloque.Tema7

fun main(parameter: Array<String>) {
    println("Enter one number")

    var number = readln().toInt()

    if (number < 10) {
        println("The number has one digit")
    }else if (number < 100) {
        println("The number has two digits")
    }else if (number < 1000){
        println("The number has three digits")
    }else{
        ("Error, the number has more than 3 digits")
    }

}