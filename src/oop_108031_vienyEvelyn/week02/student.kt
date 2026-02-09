package oop_108031_vienyEvelyn.week02

class Student(
    val name: String,
    val nim: String,
    var major: String
){
    constructor(name: String, nim: String): this(name, nim, "Non-Matriculated"){
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan)")
    }
    init{
        if(nim.length != 5){
            println("WARNING: objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")

        }
        else{
            println("LOG: Objek student $name berhasil dialokasikan di Memory")
        }
    }
}

