import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

//@Suppress("unused")
class WordleTest : StringSpec({


    "isValid should return true only for 5 letter words" {
        isValid("HELLO") shouldBe true
        isValid("HI") shouldBe false
        isValid("ABCDEFG") shouldBe false
    }

    "readWordList should load words from the file" {
        val words = readWordList("data/words.txt")
        words.isNotEmpty() shouldBe true
        isValid(words[0]) shouldBe true
    }

    "pickRandomWord should remove the word it picks" {
        val w = mutableListOf("APPLE", "BERRY", "CHERRY")
        val chosen = pickRandomWord(w)

        w.size shouldBe 2
        (chosen == "APPLE" || chosen == "BERRY" || chosen == "CHERRY") shouldBe true
    }

    "evaluateGuess should show which letters match" {
        val guess = "ABCDE"
        val target = "ABZDE"

        val result = evaluateGuess(guess, target)
        result shouldBe listOf(1, 1, 0, 1, 1)
    }
})