package oop_108031_vienyEvelyn.week01

fun main(){
    val gameTitle : String = "Where Winds Meet"
    val price : Int = 100000

    val diskon = calculateDiscount(price)
    val harga_akhir = price - (price * diskon/100)
    var userNote : String? = null
    printReceipt( finalPrice = harga_akhir, title=gameTitle, userNote = userNote)




   /* println("Judul: $gameTitle")
    println("Harga asli: $price")
    println("Diskon: $diskon")
    println("Harga akhir: ${price - (price * diskon/100)}")*/

}
fun calculateDiscount(price: Int): Int = if (price > 500000) 20 else 10

fun printReceipt(title: String, finalPrice: Int, userNote: String?) {
    println("Judul: $title")
    println("Price: $finalPrice")
    val note = userNote ?: "Tidak ada catatan"
    println("UserNote: $note")

}
