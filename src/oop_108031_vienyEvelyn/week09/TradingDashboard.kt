package oop_108031_vienyEvelyn.week09

fun main(){
    val tradeHistory  = listOf(
        TradeLog("A", "Long", 20, 15.5, "CLOSED"),
        TradeLog("B", "Short", 10, -5.2, "CLOSED"),
        TradeLog("A", "Short", 50, 45.0, "OPEN"),
        TradeLog("C", "Long", 15, -12.8, "OPEN"),
        TradeLog("B", "Long", 25, 8.4, "CLOSED"),
        TradeLog("A", "Short", 10, -2.5, "CLOSED"),)

    val closedTrades = tradeHistory.filter{it.status == "CLOSED"}
    closedTrades.forEach { println(closedTrades) }


}