package TercerBloque.Tema36

import java.lang.StringBuilder

fun filter(chain: String, fn: (Char) -> Boolean): String {
    val chai = StringBuilder()
    for (ele in chain)
        if (fn(ele))
            chai.append(ele)
    return chai.toString()
}

fun main() {
    var chain = "This is the prove 1 or 2?"
    println("Original String")
    println(chain)

    var result1 = filter(chain) {
        if (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' ||
            it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U') {
            true
        } else {
            false
        }
    }

    println("Only the vowel")
    println(result1)

    var result2 = filter(chain) {
        if (it in 'a'..'z') {
            true
        } else {
            false
        }
    }
    println("Only the characters minus")
    println(result2)
    var result3 = filter(chain) {
        if (it !in 'a'..'z' && it !in 'A'..'Z')
            true
        else
            false
    }
    println("Only the characters not alphabetics")
    println(result3)
}
