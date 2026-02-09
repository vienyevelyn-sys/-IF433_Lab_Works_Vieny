package oop_108031_vienyEvelyn.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if(nim.length != 5){
        println("ERROR: Pendaftaran dibatalkan. Nim harus 5 karakter.")
    }
    else{

        print("Pilih jalur (1. Reguler, 2. Umum)")
        val type = scanner.nextInt()
        scanner.nextLine()

        if(type == 1){
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()
            val s1 = Student(name, nim, major)
            println("Terdaftar di ${s1.major} dengan GPA awal ${s1.gpa}")

        }
        else if (type == 2){
            val s2 = Student(name, nim)
            println("terdaftar di ${s2.major} dengan GPA awal ${s2.gpa}")
        }else{
            println("Pilihan ngawur, pendaftaran batal")
        }




    }

    println("------ APLIKASI HITUND DENDA  ---")
    print("Masukkan Judul: ")
    val judul = scanner.nextLine()

    print("Peminjam: ")
    val peminjam = scanner.nextLine()

    print("lama pinjaman: ")
    var durasi: Int = scanner.nextInt()
    if (durasi <= 0){
        durasi = 1
    }
    val loan = Loan(judul, peminjam, durasi)
    val total_denda = loan.calculateFine()
    print("Denda yang dimiliki ${total_denda}")

    println("\n--- APLIKASI GAME RPG  ---")

    print("Masukkan Hero: ")
    val hero = scanner.next()

    print("Masukkan baseDamage: ")
    val baseDamage = scanner.nextInt()

    val hero1 = Hero(hero, baseDamage = baseDamage)
    var enemyHp: Int = 100
    while (hero1.isAlive() && enemyHp > 0){
        println("Menu: 1. Serang, 2. Kabur")
        var opsi = scanner.nextInt()
        if (opsi == 1){
            enemyHp -= hero1.baseDamage
            if(enemyHp <= 0){
                enemyHp = 0
            }
            println("Hp musuh tersisa ${enemyHp}")
            if(enemyHp > 0){
                hero1.takeDamage((10..20).random())
            }
            println("Sisa Hp ${hero1.name} ${hero1.hp}")
        }
        else if (opsi == 2){
            break
        }
    }
    if(hero1.hp < enemyHp){
        println("Enemy menang")
    }
    else{
        println("${hero1.name} menang")
    }

}


