fun main() {


    val words = readWordList("data/words.txt")

    if (words.isEmpty()) {
        println("Could not load word list")
        return
    }

    val targetWord = pickRandomWord(words)

    println("Guess the word")

    for (attempt in 1.10) {
        val guess = obtainGuess(attempt)
        val matches = evaluateGuess(guess, targetWord)

        displayGuess(guess, matches)

        if (matches.all { it == 1 }) {
            println("guess correct, word is $targetWord")
            return
        }
    }

    println("No attempts left, word was $targetWord")




}
