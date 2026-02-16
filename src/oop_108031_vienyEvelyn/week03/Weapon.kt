package oop_108031_vienyEvelyn.week03

class Weapon(name: String){
    var damage: Int = 0
        set(value){
            if(value > 1000){
                field = 1000
            }
            else if(value < 0){
                field = 0
                println("Moho maaf, jangan masukkan nilai negatif")
            }
            else{
                field = value
            }
        }

    val tier: String
        get() {
            if (damage > 800) {
                return "legendary"
            } else if (damage > 500) {
                return "Epic"
            }
            return "Common"
        }
}

//val name: String
