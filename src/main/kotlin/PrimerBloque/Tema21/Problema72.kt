package PrimerBloque.Tema21

fun main() {
    var heights = FloatArray(5)
    var sum = 0f

    for (i in 0..heights.size - 1) {
        println("Enter the height: ")
        heights[i] = readln().toFloat()
        sum += heights[i]
    }
    var average = sum / heights.size
    println("Average height: $average")

    var tall = 0
    var small = 0
    for(i in 0..heights.size - 1) {
        if(heights[i] > average) {
            tall++
        }else{
            small++
        }
    }
    println("Number of people taller than average: $tall")
    println("Number of people smaller than average: $small")
}