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

    println("\n --- Electric Car ---")
    val mycar2 = ElectricCar("Tesla", 5, 100)
    mycar2.accelerate()
    mycar2.honk()
    mycar2.openTrunk()

    println("\n --- Manager ---")
    val emp1 = Manager("Budiono", 5000)
    emp1.work()
    println("Salary ${emp1.calculateBonus()}")

    println("\n --- Developer ---")
    val emp2 = Developer("Anton", 5000, "Python")
    emp2.work()
    println("Salary ${emp2.calculateBonus()}")

}