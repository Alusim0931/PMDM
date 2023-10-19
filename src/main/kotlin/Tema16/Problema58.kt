package Tema16

fun returnGreater(v1: Int, v2: Int):Int {
    if (v1 > v2) {
        return v1
    } else {
        return v2
    }
}

fun main() {
    println("Enter the first value: ")
    var val1 = readln().toInt()
    var val2 = readln().toInt()

    println("The greater between $val1 and $val2 is ${returnGreater(val1, val2)}")
}