// Task 4.5: summing odd integers with a for loop

fun main() {
    print("Enter the upper limit: ")
    val limit = readln().toInt()

    var sum = 0

    for (i in 1..limit step 2) {
        sum += i
    }

    println("The sum of odd numbers between 1 and $limit is $sum")
}
