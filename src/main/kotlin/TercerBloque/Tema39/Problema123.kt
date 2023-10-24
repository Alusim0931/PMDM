package TercerBloque.Tema39

fun IntArray.print() {
    print("[")
    for (element in this) {
        print("$element")
    }
    print("]")
}

fun main() {
    var repariment1 = IntArray(10, {it})
    repariment1.print()
}