package oop_108031_vienyEvelyn.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $id dengan nama $name is turn on")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $id dengan nama $name is turn off")
        stopRecord()
    }

    override fun startRecord() {
        println("Mulai Recording..")
    }

}