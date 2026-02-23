package oop_108031_vienyEvelyn.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand){
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk(){
        println("Tin Tin! mobil $brand lewat!")
    }
}