package SegundoBloque.Tema23

class Student {
    var name: String = ""
    var note: Int = 0

    fun init() {
        println("Enter the name of the student: ")
        name = readln().toString()
        println("Enter te note of the student")
        note = readln().toInt()
    }

    fun print() {
        println("$name has this note: $note")
    }

    fun showState() {
        if (note >= 4) {
            println("The student has a regular note")
        } else {
            println("The note not is a regular note")
        }
    }
}

fun main() {
    var student1 = Student()
    student1.init()
    student1.print()
    student1.showState()

    var student2 = Student()
    student2.init()
    student2.print()
    student2.showState()
}