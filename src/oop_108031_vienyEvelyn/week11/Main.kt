package oop_108031_vienyEvelyn.week11

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Aelx".addGreeting())
    println("Hi".repeatTimes(3))

    val test: String? = null
    println("Apakah null atau empty? ${test.isNullOrEmptyCustom()}")

}