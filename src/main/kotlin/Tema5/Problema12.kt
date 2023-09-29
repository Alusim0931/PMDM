package Tema5

fun main(parameter: Array<String>){

    println("Write 2 numbers")

    var val1 = readln().toInt()
    var val2 = readln().toInt()

    if(val1 < val2){
        var sum = val1 + val2
        var rest = val1 - val2

        println("The sum of the numbers is $sum and the rest is $rest")
    }else{
        var mult = val1 * val2
        var div = val1 / val2

        println("The mult of the numbers is $mult and the div is $div")
    }
}