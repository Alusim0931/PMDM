package Tema12

fun main() {
    println("Enter 3 numbers: ")
    var note1 = readln().toInt()
    var note2 = readln().toInt()
    var note3 = readln().toInt()

    val average = (note1 + note2 + note3) / 3
    when {
        average >= 7 -> println("You pass. Congrats!!")
        average >= 4 -> println("You pass by a whisper")
        else -> println("You don't pass. Study!!")
    }
}