package oop_108031_vienyEvelyn.week05

class Admin(nama: String): Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")

    }
    fun doAdminWork(){
        println("[$nama] sedang dmerekap data absensi mahasiswa")
    }
}