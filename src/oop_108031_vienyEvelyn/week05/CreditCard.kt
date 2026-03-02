package oop_108031_vienyEvelyn.week05

class CreditCard(accountName: String, val limit: Double,  var usedAmount: Double = 0.0) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if(amount + usedAmount < limit) {
            usedAmount += amount
            println("Saldo sekarang: ${usedAmount}")
        }
        else{
            println("Transaksi ditolak. Melebihi limit")
        }
    }

}