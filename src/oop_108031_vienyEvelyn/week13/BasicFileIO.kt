package oop_108031_vienyEvelyn.week13
import  java.io.File

fun main(){
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Insialisasi Sistem\n")
    println("File berhasil dibuat dan ditulis")

    file.appendText("Line 2: Menambahan konfigurasi baru\n")
    println("Teks berhasil di-append")

    println("\n=== TEST READ TEXT ===")
    val fullContent = file.readText()
    println("Membaca sealigus: \n$fullContent")

    println("=== TEST READ LINES ====")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->
        println("Isi Index $index: $line")
    }
}