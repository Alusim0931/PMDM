package SegundoBloque.Tema25

class Client(var name: String, var monto: Float) {
    fun deposit(monto: Float) {
        this.monto += monto
    }
    fun extract(monto: Float) {
        this.monto -= monto
    }
    fun print() {
        println("$name has deposited the sum of the $monto")
    }
}

class Bank {
    var client1: Client = Client("Joaquin", 0f)
    var client2: Client = Client("Alex", 0f)
    var client3: Client = Client("Adriana", 0f)

    fun operate() {
        client1.deposit(100f)
        client2.deposit(200f)
        client3.deposit(300f)
        client3.deposit(350f)
    }

    fun totalDeposits() {
        var total = client1.monto + client2.monto + client3.monto
        println("The total money bank is: $total")
        client1.print()
        client2.print()
        client3.print()
    }
}

fun main() {
    var bank = Bank()
    bank.operate()
    bank.totalDeposits()
}