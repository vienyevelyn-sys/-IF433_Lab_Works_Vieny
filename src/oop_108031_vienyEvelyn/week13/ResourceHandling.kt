package oop_108031_vienyEvelyn.week13
import java.io.File

fun main(){
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")
    val writer = unsafeFile.printWriter()
    writer.println("Log 1: Membua koneksi Database...")
    writer.println("Log 2: Menulis data pengguna...")

    writer.close()
    println("Proses penulisan unsafe selesai.")

    println("\n=== TESET SAFE RESOURCE HANDLING ===")
    val safeFile = File("safe_logs.txt")
    safeFile.printWriter().use{ out ->
        for (i in 1..100){
            out.println("Safe log entry #$i: System status ok.")
        }

    }
    println("1000 baris log berhail di geneate denga sangat aman")
}