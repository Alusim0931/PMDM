package PrimerBloque.Tema5

fun main(parameter: Array<String>) {

    println("Write the first 3 marks")

    var mark1 = readln().toInt()
    var mark2 = readln().toInt()
    var mark3 = readln().toInt()

    val average = (mark1 + mark2 + mark3) / 2

    if(average >= 7) {
        println("You are promoted. Congratulations!!!")
    }else
        println("You are not promoted, sorry")


}