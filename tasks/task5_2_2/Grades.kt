// Task 5.2.2: conversion of marks into grades, using a function
import kotlin.system.exitProcess

fun grade(mark: Int): String {
    when (mark) {
        in 0..39   -> return "Fail"
        in 40..69  -> return "Pass"
        in 70..100 -> return "Distinction"
        else       -> return "?"
    }
}

fun main(args: Array<String>) {
    // if (args.size != 1) {
    //     println("Need at least one command line argument")
    //     exitProcess(1)
    // }
    for (i in 0..(args.size -1)) {
        var mark = args[i].toInt()
        var grade = grade(mark)
        println(mark)
        println(grade)

    }
}