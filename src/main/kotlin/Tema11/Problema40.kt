package Tema11

fun main() {
    var aproves = 0
    var repobrates = 0

    for(i in 1..10) {
        println("Enter the note")
        val note = readln().toInt()

        if (note <= 7) {
            aproves++
        }else {
            repobrates++
        }
    }
    println("Number of students approved with a grade greater than or equal to 7: $aproves")
    println("Number with grade of students under 7: $repobrates")
}