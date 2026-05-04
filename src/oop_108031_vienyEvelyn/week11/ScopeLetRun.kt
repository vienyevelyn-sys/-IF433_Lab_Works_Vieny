package oop_108031_vienyEvelyn.week11

fun main(){
    println("=== Test LET Function ===")
    val name: String? = "Alexander"
    val length = name?.let {
        println("Nama terdetejksi $it")
        it.length
    }

    println("Panjang nama: $length")
}