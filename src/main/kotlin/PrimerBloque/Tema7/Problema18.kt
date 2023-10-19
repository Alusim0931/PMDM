package PrimerBloque.Tema7

fun main(parameter: Array<String>) {
    println("Write 3 numbers")

    var mathNote = readln().toInt()
    var progNote = readln().toInt()
    var engNot = readln().toInt()

    var average = (mathNote + progNote + engNot) / 2

    if (average >= 7) {
        println("You are promoted.Congrats!!!")
    } else if(average >= 4) {
        println("You have a regular notes.")
    } else {
        println("You are reprobed. Sorry!!!")
    }
}