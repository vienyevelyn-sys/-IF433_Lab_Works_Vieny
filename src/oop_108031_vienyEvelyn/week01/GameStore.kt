package oop_108031_vienyEvelyn.week01

fun main(){
    val gameTitle : String = "Where Winds Meet"
    val price : Int = 100000

    val diskon = calculateDiscount(price)
    val harga_akir =
    println("Judul: $gameTitle")
    println("Harga asli: $price")
    println("Diskon: $diskon")
    println("Harga akhir: ${price - (price * diskon/100)}")

}
fun calculateDiscount(price: Int): Int = if (price > 500000) 20 else 10

