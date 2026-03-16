package oop_108031_vienyEvelyn.week07

class NetworkClient private constructor(val url: String) {
    fun connect(){
        println("Connecting to $url..")
    }
}