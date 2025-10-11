fun main() {

    println("PIZZA MENU\na) CHEESE\nb) PEPPERONI\nc) PINEAPPLE\nd) EXTRA CHEESE")
    
    val choice = readln().lowercase()
    // val choiceLength = choice.length
    // println(choiceLength)
    if (choice.length == 1 && choice in "a".."d") {
        println("Order Accepted") 
        }
    else {
        println("Invalid Choice!")
    }


}