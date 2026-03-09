package oop_108031_vienyEvelyn.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable{
    override fun turnOn() {
        println("Ini adalah lampu dengan nama $name is turned on")
    }

    override fun turnOff() {
        println("Ini adalah lampu dengan nama $name is turned off")

    }

}