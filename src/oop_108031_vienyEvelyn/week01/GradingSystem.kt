package oop_108031_vienyEvelyn.week01

fun calculateStatus(score: Int) = if(score > 75) "lulus" else "tidak lulus"

fun main(){
    var name: String = "Vieny Evelyn"
    var score: Int = 80

    //println("Nama:" + name + ", Nilai: "+ score)
    //print("Nama: $name, Nilai: $score")

    //val grade = when(score){
     //   in 90..100 -> "A"
     //   in 80..89 -> "B"
     //   in 70..79 -> "C"
     //   else -> "D"
    //}
    //print("Grade kamu: $grade")

    println("status: ${calculateStatus(score)}")


}