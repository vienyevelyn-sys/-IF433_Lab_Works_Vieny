package oop_108031_vienyEvelyn.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 20.0))
    coinRepo.add(Coin("ETH", 9.0))
    coinRepo.add(Coin("USDT", 15.0))
}