package SegundoBloque.Tema32

abstract class Account(var titular: String, var monto: Double) {
    open fun print() {
        println("Titualar: $titular ")
        println("Monto: $monto")
    }
}

class SavingBox(titular: String, monto: Double): Account(titular, monto) {
    override fun print() {
        println("Account of SavingBox: ")
        super.print()
    }
}

class FixedTerm(titular: String, monto: Double, var deadlines: Int ,var Term: Double): Account(titular, monto) {
    override fun print() {
        println("Account of Fixed term")
        println("Term of days: $deadlines")
        println("Terms: $Term")
        var profits = monto * Term / 100
        println("Import of the terms: $profits")
        super.print()
    }
}

fun main() {
    var savingBox1 = SavingBox("Juan", 10000.0)
    savingBox1.print()
    println("\t")
    var fixedTerm1 = FixedTerm("Anna", 10000.0, 30, 2.2)
    fixedTerm1.print()
}