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


    println("TUGAS MANDIRI 1")
    println("---- Weapon 1 ----")
    val w1 = Weapon("Pisau")
    w1.damage = -50
    println(w1.damage)
    println(w1.tier)

    println("---- Weapon 2 ----")
    val w2 = Weapon("Panah")
    w2.damage = 9999
    println(w2.damage)
    println(w2.tier)

//    println("TUGAS MANDIRI 2")
//    val p1 = Player()
//
//    p1.addXp(50)
//    p1.addXp(60)
////    p1.xp

}