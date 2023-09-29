package Tema7

fun main(parameter: Array<String>) {
    println("Enter your 3 notes")

    var mathNote = readln().toInt()
    var progNote = readln().toInt()
    var engNote = readln().toInt()

    val average = (mathNote + progNote + engNote) / 2

    val result = if(average >= 7) "Promoted" else if(average >=4) "Regular" else "Reprobed"
    println("Your state is $result")

}