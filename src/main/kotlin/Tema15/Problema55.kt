package Tema15

fun showGreater(v1: Int, v2: Int, v3: Int) {
    println("Greater: ")
    if (v1 > v2 && v1 > v3) {
        println("The greater is $v1")
    }else if(v2 > v3) {
        println("The greater is $v2")
    }else {
        println("The greater is $v3")
    }
}

fun main() {
    println("Enter 3 values: ")
    var val1 = readln().toInt()
    var val2 = readln().toInt()
    var val3 = readln().toInt()

    showGreater(val1, val2, val3)
}