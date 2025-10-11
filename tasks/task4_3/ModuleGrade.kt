import kotlin.system.exitProcess
fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Not enough args or not correct type")
        exitProcess(1)
    }
    // val mark1 = args[0].toInt()
    // val mark2 = args[1].toInt()
    // val mark3 = args[2].toInt()

    // val avgMark = (mark1 + mark2 + mark3) / args.size
    val avgMark = args.map { it.toInt() }.sum() / args.size


    val Grade = when (avgMark) {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "Not a valid grade"
    }

    println(avgMark)
    println(Grade)

}