package oop_108031_vienyEvelyn.week13
import java.io.File
import java.io.FileNotFoundException
data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String = "$id,$symbol,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {

    try{
        val parts = line.split(",")
        return TradeRecord(parts[0].toInt(), parts[1], parts[2], parts[3].toDouble(), parts[4].toDouble())
    }catch (e: NumberFormatException){
        println("(Log) Data korup diabaikan: $line")
        println(e.message)
    }
    catch(e: IndexOutOfBoundsException){
        println("(Log) Data korup diabaikan: $line")
        println(e.message)
    }
    catch(e: Exception){
        println("(Log) Data korup diabaikan: $line")
        println(e.message)
    }
     return null

}

fun saveTrades(trades: List<TradeRecord>, path: String){
    File(path).printWriter().use{ out ->
        trades.forEach { out.println(it.toCsv()) }

    }
}

fun loadTrades(path: String): List<TradeRecord>{
    return try{
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    }
    catch (e: FileNotFoundException){
        println("Error: File tidak ditemukan")
        emptyList()
    }
}

fun main(){
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 1500.0, 320.5),
        TradeRecord(2, "ETHUSDT", "Short", 1000.0, -120.75),
        TradeRecord(3, "SOLUSDT", "Long", 750.0, 89.3)
    )

    println(trades)
    saveTrades(trades, "crypto_trades.csv")

    println("Data trade berhasil disimpan ke crypto_trades.csv")

    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    println("Baris data korup berhasil ditambahkan")

    val loadedTrades = loadTrades("crypto_trades.csv")

    println("\nHasil load data valid:")
    loadedTrades.forEach {
        println(it)
    }

    val loadedData = loadTrades("crypto_trades.csv")
    val sumLoad = loadedData.sumOf { it.pnl }
    println(sumLoad)
}