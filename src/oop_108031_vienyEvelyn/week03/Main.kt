package oop_108031_vienyEvelyn.week03

fun main(){
    val e = Employee("Budi")
//    println("--- Test Error ---")
//    e.salary = 5000

//    Test validasi salary
//    e.salary = -1000
    e.salary = 5000000
    println("Gaji ${e.salary}")


//    Test encapsulation
    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

//    val c = Weapon("budi")
//    c.damage = -7
//    println(c.damage)
//    println(c.tier)

}