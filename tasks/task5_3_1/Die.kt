import kotlin.random.Random

fun rollDie(sides: Int = 6) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun readInt(prompt: String): Int? {
    println(prompt)
    val input = readln()
    return if (input.isBlank()) null else (input.toIntOrNull())
    

}

fun main() {
    val userInput = readInt("Enter a number for a dice")
    if (userInput == null) {
        rollDie()
    }
    else {
        rollDie(userInput)
        rollDie(2)        
    }

}