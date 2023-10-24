package SegundoBloque.Tema34

data class Article(var code: Int, var description: String, var price: Float) {
    companion object {
        fun print(articles: Array<Article>) {
            for (article in articles) {
                println("Code: ${article.code}, Description: ${article.description}, Price: ${article.price}")
            }
        }

        fun increasePrice(articles: Array<Article>) {
            for (article in articles) {
                article.price = article.price + (article.price * 0.10f)
            }
        }
    }
}

fun main() {
    var articles: Array<Article> = arrayOf(
        Article(1, "papas", 7.5f),
        Article(2, "manzanas", 23.2f),
        Article(3, "naranjas", 12f),
        Article(4, "cebolla", 21f)
    )

    println("List of actual prices: ")
    Article.print(articles)
    Article.increasePrice(articles)
    println()
    println("List of prices increased by 10%: ")
    Article.print(articles)
}
