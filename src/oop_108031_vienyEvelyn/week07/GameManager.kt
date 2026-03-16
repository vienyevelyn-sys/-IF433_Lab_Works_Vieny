package oop_108031_vienyEvelyn.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame(){
        when(isGameRunning){
            true -> println("Game sudah berjalan")
            false -> {
                isGameRunning = true
                println("Memulai Game Engine")

            }

        }
    }
}