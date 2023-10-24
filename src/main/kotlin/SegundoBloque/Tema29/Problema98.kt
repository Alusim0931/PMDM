package SegundoBloque.Tema29

enum class Countries (var population: Int) {
    BRASIL (202450649),
    COLOMBIA (50364000),
    PERU (31151643),
    VENEZUELA (31028337),
    CHILE (18261884),
    ECUADOR (16298217),
    BOLIVIA (10888000),
    PARAGUAY (6460000),
    URUGUAY (3372000)
}

fun main() {
    var country1 = Countries.BRASIL
    println(country1)
    println(country1.population)
}