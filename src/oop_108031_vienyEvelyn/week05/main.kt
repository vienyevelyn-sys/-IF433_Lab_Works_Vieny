package oop_108031_vienyEvelyn.week05

fun main(){
    val dosen1 = Dosen("Pak Alex", "0123456789")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== Aktivitas Pegawai ===")
    for (pegawai in daftarPegawai){
        pegawai.bekerja()

        when (pegawai){
            is Dosen ->{
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
            }
            is Admin ->{
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------------------------")
    }

//    TUGAS MANDIRI 1
    println("\n TUGAS MANDIRI 1")
    println("PERSGI -> SISI = 20")
    val persegi = MathHelper()
    var luas = persegi.hitungLuas(20)
    println("Luas persegi: $luas")

    println("PERSGI PANJANG-> PANJANG = 2, LEBAR = 10")
    val persegi_panjang = MathHelper()
    luas = persegi_panjang.hitungLuas(2, 10)
    println("Luas persegi panjang: $luas")

    println("LINGKARAN-> JARI-JARI = 14")
    val lingkaran= MathHelper()
    luas = persegi_panjang.hitungLuas(14)
    println("Luas persegi panjang: $luas")
    println("-----------------------------------------")

    println("\n TUGAS MANDIRI 2")
    val akun1 = EWallet("budiono", 50000.0)
    val akun2 = CreditCard("budiono", 100000.0)

    val daftarAkun: List<PaymentMethod> = listOf(akun1, akun2)
    for(akun in daftarAkun){
        akun.processPayment(2000.0)
    }
}