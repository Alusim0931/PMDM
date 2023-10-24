package SegundoBloque.Tema24

class Sons {
    var ages = IntArray(5)

    fun charges() {
        for (i in ages.indices) {
            println("Enter the ages:")
            ages[i] = readln().toInt()
        }
        greaterAge()
        average()
    }

    fun greaterAge() {
        var greater = ages[0]
        for (i in ages.indices) {
            if (ages[i] > greater) {
                greater = ages[i]
                println("The son with greater age is $greater")
            }
        }
    }

    fun average() {
        var sum = 0
        for (i in ages.indices) {
            sum += ages[i]
            var average = sum / ages.size
            println("The average age is: $average")
        }
    }
}

fun main() {
    var sons1 = Sons()
    sons1.charges()
}