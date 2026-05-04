package oop_108031_vienyEvelyn.week11

data class User(var name: String ="", var age: Int = 0)

fun main(){
    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "ALex"
        age = 26
    }

    println(user)
}