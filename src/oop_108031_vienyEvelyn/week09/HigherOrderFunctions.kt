package oop_108031_vienyEvelyn.week09

fun main(){
    val numbers = listOf(1,2,3,4,5,6,7,8)
    println("Original numbers: $numbers")
    println("\n=== HOF:Filter ===")
    val evens = numbers.filter { it % 2 == 0 }
    println("Evens only: $evens")

    println("\n=== HOF: MAP ===")
    val multiplied = evens.map { it * 10 }
    val asString = numbers.map { "Rp.${it}k" }
    println("Formatted: $asString")
    println("Multiplied: $multiplied")

    println("\n=== HOF: Sorted and foreach ===")
    val randomNames = listOf("Charlie", "Alice", "Bob")
    val sortedReverse = randomNames.sortedByDescending{it}
    sortedReverse.forEach {name->
        println("user: $name")
    }
}