package TercerBloque.Tema41

fun quantityMajor(vararg ages: Int) = ages.count{it >= 18}

fun main() = println(quantityMajor(3,65,32,23,2,98,23,45,15))