package oop_108031_vienyEvelyn.week10

interface HasName{
    val nama : String
}
class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) = items.add(item)

    fun getAll(): List<T> = items

    fun search(keyword: String) :List<T>{
        return items.filter{
            it is HasName && it.nama.contains(keyword, ignoreCase = true)
        }
    }
}
