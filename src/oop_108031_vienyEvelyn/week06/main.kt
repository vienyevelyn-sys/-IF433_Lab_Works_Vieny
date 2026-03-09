package oop_108031_vienyEvelyn.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("--> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)


    val lampuPintar = SmartLamp ("1", "Ruang Tamu")
    val speakerPintar = SmartSpeaker ("2", "Google Nest Dapur")
    val cctvPintar = SmartCCTV ("3", "Ezviz Garasi")


}