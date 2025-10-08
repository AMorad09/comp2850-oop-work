// Task 3.1: command line arguments

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: amounts of arguments not met")
        exitProcess(1)
    }
    println(args[0])
    println(args[1])
    }

    // required argument available as args[0]
