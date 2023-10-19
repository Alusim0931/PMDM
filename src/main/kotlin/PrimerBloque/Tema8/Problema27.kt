package PrimerBloque.Tema8

fun main(parameter: Array<String>) {
    println("Introduce a day and month")

    var day = readln().toInt()
    var month = readln().toInt()

    if(day == 25 && month == 12) {
        println("You put a special day. Christmas!!! Ho-Ho-Ho")
    }else {
        println("That not is a happy day -_-' ")
    }
}