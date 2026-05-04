package oop_108031_vienyEvelyn.week11

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Aelx".addGreeting())
    println("Hi".repeatTimes(3))

    val test: String? = null
    println("Apakah null atau empty? ${test.isNullOrEmptyCustom()}")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".addGreeting().run{
        println("Memproses kata ${this}")
        this.length * 2
    }
    println("Hasil kalkulasi run: $result")
}