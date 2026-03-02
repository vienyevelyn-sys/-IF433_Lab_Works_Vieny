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

}