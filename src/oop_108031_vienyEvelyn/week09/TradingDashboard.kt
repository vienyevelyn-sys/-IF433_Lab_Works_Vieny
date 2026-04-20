package oop_108031_vienyEvelyn.week09

fun main(){
    val tradeHistory  = listOf(
        TradeLog("A", "Long", 20, 15.5, "CLOSED"),
        TradeLog("B", "Short", 10, -5.2, "CLOSED"),
        TradeLog("A", "Short", 50, 45.0, "OPEN"),
        TradeLog("C", "Long", 15, -12.8, "OPEN"),
        TradeLog("B", "Long", 25, 8.4, "CLOSED"),
        TradeLog("A", "Short", 10, -2.5, "CLOSED"),)

    println("\n=== CHECKPOINT 12 ===")
    val closedTrades = tradeHistory.filter{it.status == "CLOSED"}
    closedTrades.forEach { println(closedTrades) }

    println("\n=== CHECKPOINT 13 ===")
    val winningTrades = closedTrades.filter{it.roe > 0}
    winningTrades.forEach { println(winningTrades) }

    println("\n=== CHECKPOINT 14 ===")
    val losingTrades = closedTrades.filter{it.roe <= 0}
    losingTrades.forEach { println(losingTrades) }

    println("\n=== CHECKPOINT 15 ===")
    val topPerformersString = winningTrades.sortedByDescending { it.roe }
        .map{"WIN [${it.pair} - ${it.position}]: +${it.roe} ROE (LEV: ${it.leverage}X)"}
    topPerformersString.forEach { println(it) }

    println("\n=== CHECKPOINT 16 ===")
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map{"LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (LEV: ${it.leverage}X)"}
    worstPerformersString.forEach { println(it) }

    println("\n=== CHECKPOINT 17 ===")
    tradeHistory.map{it.pair}
        .toSet()

    tradeHistory.forEach{println(it)}

    println("\n=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }
}