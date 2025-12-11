import java.io.File

const val WORDLENGTH = 5
const val MAXATTEMPTS = 10

fun isValid(word: String): Boolean {
    return word.length == WORDLENGTH
}

fun readWordList(filename: String): MutableList<String> {
    val words = mutableListOf<String>()
    val lines = File(filename).readLines()

    for (line in lines) {
        val w = line.trim()
        if (w.isNotEmpty()) {
            words.add(w)
        }
    }

    return words
}

fun pickRandomWord(words: MutableList<String>): String {
    val i = (0 until words.size).random()
    val chosenWord = words[i]
    words.removeAt(i)
    return chosenWord
}

fun obtainGuess(attempt: Int): String {
    while (true) {
        print("attempt $attempt: ")
        val guess = readLine()

        if (guess != null && isValid(guess)) {
            return guess.uppercase()
        } else {
            println("enter a valid 5 letter word")
        }
    }
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    val result = mutableListOf<Int>()

    for (i in 0 until WORDLENGTH) {
        if (guess[i] == target[i]) {
            result.add(1)
        } else {
            result.add(0)
        }
    }
    return result
}

fun displayGuess(guess: String, matches: List<Int>) {
    for (i in 0 until 5) {
        if (matches[i] == 1) {
            print(guess[i])
        } else {
            print("?")
        }
    }
    println()
}
