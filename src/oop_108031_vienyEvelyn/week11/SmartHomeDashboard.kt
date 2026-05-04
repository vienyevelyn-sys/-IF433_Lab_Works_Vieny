package oop_108031_vienyEvelyn.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("Philips WiZ Living Room", "Lighting").apply{
        isOnline=  true
        powerLoad = 12
    }.also{
        homeDevices.add(it)
        println("Sucessfully added ${it.name}")
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply{
        isOnline = true
        powerLoad = 5
    }.also{
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val ACInverter = run{
        return@run SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(ACInverter)

    val AutoFeeder = run{
        return@run SmartDevice("Picolo's Auto Feeder","Pet Care", true, 10)
    }
    homeDevices.add(AutoFeeder)

    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }

    with(homeDevices){
        println(homeDevices)
        println(this.size)
    }

    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total power: $totalPower")
}