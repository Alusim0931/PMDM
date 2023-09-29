package Tema7

fun main(parameter: Array<String>) {
    println("Write 3 numbers")

    var num1 = readln().toInt()
    var num2 = readln().toInt()
    var num3 = readln().toInt()

    if (num1 > num2){
    }
    if (num1 > num3){
        print("The greater num is $num1")
    }else if(num3 > num1){
        print("The greater num is $num3")
    } else if (num2 > num3) {
        print("The greater num is $num2")
    } else {
        print("The greater num is $num3")
    }

}
