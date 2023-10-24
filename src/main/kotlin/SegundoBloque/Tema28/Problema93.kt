package SegundoBloque.Tema28

data class Article(var code: Int, var descrpition: String, var price: Float)

fun main() {
    var article1 = Article(123, "Case", 4f)
    var article2 = Article(321, "Case", 6f)
    println(article1)
    println(article2)

    var pointer = article1
    pointer.price = 5f
    println(article1)

    var article3 = article1.copy()
    article1.price = 7f
    println(article1)
    println(article3)

    if (article1 == article3) {
        println("Are equals $article1 and $article3")
    } else {
        println("Are distinct $article1 and $article3")
        article3.price = 7f
    }
    if (article1 == article3) {
        println("Are equals $article1 and $article3")
    } else {
        println("Are distinct $article1 and $article3")
    }
}

