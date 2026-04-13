package oop_108031_vienyEvelyn.week08

fun main() {
    println("=== Test Safe Calls and Elvis ===")
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println ("Tujuan Pengiriman $destination")
}