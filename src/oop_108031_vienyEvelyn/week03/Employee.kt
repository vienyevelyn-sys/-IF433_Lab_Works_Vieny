package oop_108031_vienyEvelyn.week03

class Employee (val name: String){
    var salary: Int = 0
//        set(value) {
//            println("Mencova set gaji ke $value");
//            this.salary = value;
//        }
        set(value) {
            if(value < 0){
                println("Error: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            }
            else{
                field = value
            }
        }
}