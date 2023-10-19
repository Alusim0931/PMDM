package PrimerBloque.Tema7

fun main(parameter: Array<String>) {

    println("Enter the number of questions")
    var numQuestions = readln().toInt()

    println("Enter the number of correct answers")
    var numCorrect = readln().toInt()

    val average = numCorrect * 100 / numQuestions
    if (average >= 90){
        println("You have the maxim level")
    }else if (average >= 75) {
        println("You are in an intermediate level")
    } else if (average >= 50) {
        println("You have a regular level")
    }else {
        println("You are out")
    }
}