package SegundoBloque.Tema26

import kotlin.math.min

class Vector {
    private val vec = IntArray(5)

    init {
        charge()
    }

    private fun charge() {
        for (i in vec.indices) {
            vec[i] = (Math.random() * 11).toInt()
        }
    }

    fun print() {
        println("Full fix listing: ")
        for (i in vec.indices) {
            println("${vec[i]} - ")
            println()
        }
    }

    fun showGreater() {
        var greater = vec[0]

        for (i in vec.indices) {
            if (vec[i] > greater) {
                greater = vec[i]
            }

            println("The most arranged element is: $greater")
        }
    }

    fun showMinor() {
        var minor = vec[0]

        for (i in vec.indices) {
            if (vec[i] > minor) {
                minor = vec[i]
            }

            println("The smallest arranged element is: $minor")
        }
    }
}

fun main() {
    var vector1 = Vector()
    vector1.print()
    vector1.showGreater()
    vector1.showMinor()
}