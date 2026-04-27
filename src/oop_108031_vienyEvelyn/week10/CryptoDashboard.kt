package oop_108031_vienyEvelyn.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 20.0))
    coinRepo.add(Coin("ETH", 9.0))
    coinRepo.add(Coin("USDT", 15.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    response.data.forEach { println(it) }
}