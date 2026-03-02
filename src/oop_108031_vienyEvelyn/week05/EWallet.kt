package oop_108031_vienyEvelyn.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName)  {
    override fun processPayment(amount: Double) {
        if (amount > balance) {
            balance -= amount
            println("Saldo sekarang: ${balance}")
        }
        else{
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Saldo sekarang: ${balance}")
    }
}