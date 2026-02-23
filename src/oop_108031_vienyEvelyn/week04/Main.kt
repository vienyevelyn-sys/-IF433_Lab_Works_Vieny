package oop_108031_vienyEvelyn.week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")

    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n --- testing car ---")
    val mycar = Car("Toyota", 4)
    mycar.openTrunk()
    mycar.honk()
    mycar.accelerate()

}