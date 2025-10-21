import kotlin.random.Random

fun rollDice(sides: Int = 6, rolls: Int = 1) {
    var result = 0
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        repeat(rolls) {
            //println("Rolling a d$sides...")
            result += Random.nextInt(1, sides + 1)
        }
        println("Your total is $result")
        //println("You rolled $result")
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

fun readRolls(prompt: String): Int? {
    println(prompt)
    val input = readln()
    return if (input.isBlank()) null else (input.toIntOrNull())


}

fun main() {
    val userInput = readInt("Enter a number for a dice")
    val userRolls = readRolls("Enter the amount of dice rolls")
    if (userInput == null && userRolls == null) {
        rollDice()
    }
    else if (userInput == null) {
        rollDice(rolls = userRolls ?: 1)

    }
    else if (userRolls == null) {
        rollDice(sides = userInput ?: 6)
    }
    else {
        rollDice(userInput, userRolls)
        //rollDie(2)        
    }

}