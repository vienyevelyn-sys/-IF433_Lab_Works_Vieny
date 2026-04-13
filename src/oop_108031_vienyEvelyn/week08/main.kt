package oop_108031_vienyEvelyn.week08

fun main() {
    println("=== Test Safe Calls and Elvis ===")
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println ("Tujuan Pengiriman $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi valid. Harga Rp$price, pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di set"

    println (receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData : List<Any> = listOf("SmartPhone", 1500000, UserProfile("Andi", null), "Laptop", 4500000.0)

    for (item in mixedData) {
        val text = item as? String
        text?.let {
            println ("Ditemukan teks ${it.uppercase()}")
        }
    }

}