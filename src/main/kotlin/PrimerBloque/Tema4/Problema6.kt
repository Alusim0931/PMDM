package PrimerBloque.Tema4
fun main(parametro: Array<String>){

    println("Inserte el lado de un cuadrado")
    val lateral = readLine()!!.toInt()

    val perimeter = lateral * 4

    println("The perimeter is $perimeter")

}