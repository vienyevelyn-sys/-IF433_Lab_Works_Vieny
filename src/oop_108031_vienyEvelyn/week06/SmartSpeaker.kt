package oop_108031_vienyEvelyn.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable{
    override fun turnOn() {
        println("Ini adalah speaker $name is turned on")
    }

    override fun turnOff() {
        println("Ini adalah speaker $name is turned off")
    }
    fun  playMusic(song: String){
        println("Memutar lagu $song dari Spotify." )
    }
}