package oop_108031_vienyEvelyn.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) = items.add(item)

    fun getAll(): List<T> = items
}