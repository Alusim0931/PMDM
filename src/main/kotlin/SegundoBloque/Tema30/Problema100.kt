package SegundoBloque.Tema30

fun main() {
    var dice = object {
        var repairment = IntArray(5)

        fun generate() {
            for(i in repairment.indices) {
                repairment[i] = ((Math.random() * 6) + 1).toInt()
            }
        }

        fun print() {
            for (element in repairment) {
                println("$element -")
                println()
            }
        }

        fun greater(): Int {
            var greater = repairment[0]

            for (i in repairment.indices) {
                if (repairment[i] > greater) {
                    greater = repairment[i]
                }
            }
            return greater
        }
    }

    dice.generate()
    dice.print()
    println("Greater value: ")
    println(dice.greater())
}