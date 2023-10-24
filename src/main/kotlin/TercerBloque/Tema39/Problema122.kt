package TercerBloque.Tema39

fun String.firstHalf(): String {
    return this.substring(0..this.length/2 - 1)
}

fun String.secondHalf(): String {
    return this.substring(this.length/2..this.length - 1)
}

fun main() {
    var chain1 = "Wind"
    println(chain1.firstHalf())
    println(chain1.secondHalf())
}