// Task 5.1.1: anagram checking using a function
fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}



fun main() {

    println("Enter a word:")
    val first = readln()
    println("Enter a second word:")
    val second = readln()
    val result = anagrams(first, second)
    println(result)

}