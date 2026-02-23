package oop_108031_vienyEvelyn.week04

class Manager(name: String, baseSalary: Int): Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang memimpin rapat divisi."  )

    }
    override fun calculateBonus(): Int {
        super.calculateBonus()
        return baseSalary + 500000
    }
}