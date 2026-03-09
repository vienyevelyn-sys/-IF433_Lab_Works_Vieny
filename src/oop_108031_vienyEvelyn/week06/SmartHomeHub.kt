package oop_108031_vienyEvelyn.week06

class SmartHomeHub(){
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice){
        println("Tambah device $device")
    }
    fun turnOffAllSwitches(){
        for (device in devices){
            when(device){
                is Switchable -> {
                    device.turnOff()
                }
            }
        }
    }

    fun activateSecurityMode(){
        for (device in devices){
            when(device){
                is Recordable -> {

                    device.stopRecord()
                }
                is SmartSpeaker ->{
                    device.playMusic("Sirine Peringatan")
                }
            }
        }
    }
}