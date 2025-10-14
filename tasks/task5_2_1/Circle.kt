// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius

fun circlePerimeter(radius: Double) = 2 * PI * radius

fun readDouble(prompt: String): Double {
    println(prompt)
    return readln().toDouble()
    
}

fun main() {

    val input = readDouble("Select a number for the radius of a circle")
    val area = circleArea(input)
    val perimeter = circlePerimeter(input)

    println("Area is %.4f".format(area))
    println("Perimeter is %.4f".format(perimeter))

}