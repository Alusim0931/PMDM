package TercerBloque.Tema40

class Vector {
    var repairment = IntArray(5)

    fun charge() {
        for (i in repairment.indices) {
            repairment[i] = (Math.random() * 11 + 1).toInt()
        }
    }

    fun print() {
        for (element in repairment) {
            println("$element")
        }
    }

    operator fun plus(vector2: Vector): Vector {
        val sum = Vector()
        for (i in repairment.indices) {
            sum.repairment[i] = repairment[i] + vector2.repairment[i]
        }
        return sum
    }

    operator fun minus(vector2: Vector): Vector {
        val rest = Vector()
        for (i in repairment.indices) {
            rest.repairment[i] = repairment[i] - vector2.repairment[i]
        }
        return rest
    }

    operator fun times(vector2: Vector): Vector {
        val product = Vector()
        for (i in repairment.indices) {
            product.repairment[i] = repairment[i] * vector2.repairment[i]
        }
        return product
    }

    operator fun div(vector2: Vector): Vector {
        val division = Vector()
        for (i in repairment.indices) {
            division.repairment[i] = repairment[i] / vector2.repairment[i]
        }
        return division
    }
}

fun main() {
    val vec1 = Vector()
    vec1.charge()
    val vec2 = Vector()
    vec2.charge()
    vec1.print()
    vec2.print()

    val vecSum = vec1 + vec2
    println("Component-by-component addition of the two vectors")
    vecSum.print()

    val vecRes = vec1 - vec2
    println("The component-by-component subtraction of the two vectors")
    vecRes.print()

    val vecMult = vec1 * vec2
    println("The component-by-component product of the two vectors")
    vecMult.print()

    val vecDiv = vec1 / vec2
    println("The component-by-component division of the two vectors")
    vecDiv.print()
}
