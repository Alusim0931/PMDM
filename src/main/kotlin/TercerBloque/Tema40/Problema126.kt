package TercerBloque.Tema40

class Vectors {
    var repairments = IntArray(5)

    fun charges() {
        for (i in repairments.indices) {
            repairments[i] = (Math.random() * 11 + 1).toInt()
        }
    }

    fun print() {
        for (element in repairments) {
            print("$element ")
        }
    }

    operator fun times(valor: Int): Vectors {
        val product = Vectors()
        for (i in repairments.indices) {
            product.repairments[i] = repairments[i] * valor
        }
        return product
    }
}

fun main() {
    val vec1 = Vectors()
    vec1.charges()
    vec1.print()

    println("The product of a vector with the number 10 is")
    val vecProductEnt = vec1 * 10
    vecProductEnt.print()
}
