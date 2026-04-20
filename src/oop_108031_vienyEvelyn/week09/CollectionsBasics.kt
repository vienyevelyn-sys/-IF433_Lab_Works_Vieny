package oop_108031_vienyEvelyn.week09

fun main(){
    println("=== TEST LIST ===")
    val frameworks : List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable list $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable list $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1,2,2,3,3,4)
    println("Unique Numbers (set): $uniqueNumbers")

    val activaeUsers = mutableSetOf("UserA", "UserB")
    activaeUsers.add("UserC")
    activaeUsers.add("UserA")
    println("Active User: $activaeUsers")

    println("\n=== TEST MAP ===")
    val studentGrades = mapOf("Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A",)
    println("Nilai Bob ${studentGrades["Bob"]}")
    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20
    inventory["Apples"] = 45
    println("Inventory: $inventory")
}