package PrimerBloque.Tema4
fun main(perimetro: Array<String>){

    println("Import the price of article")
    val priceArticle = readLine()!!.toDouble()

    println("Import the quantity")
    val articleQuantitiy = readLine()!!.toInt()

    val abonament = priceArticle * articleQuantitiy

    println("Te client have to pay $abonament")
}