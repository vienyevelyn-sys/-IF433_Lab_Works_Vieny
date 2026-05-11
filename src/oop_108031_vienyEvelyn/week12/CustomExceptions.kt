package oop_108031_vienyEvelyn.week12


class InsufficientFundsException(
    val amount: Double,
    val balance: Double
): Exception("Attempted $amount, balance: $balance")
