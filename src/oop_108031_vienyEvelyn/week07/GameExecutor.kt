package oop_108031_vienyEvelyn.week07

fun processEvent(event: BattleState){
    when(event){
        is BattleState.GameOver -> println("Game over! Alasan: ${event.reason}")
        is BattleState.SafeZone -> println("Ini di safe Zone")
        is BattleState.MonsterEncounter -> println("Monster Encounter. Monster muncul : ${event.monsterName}")
        is BattleState.LootDropped -> println("Barang ditemukan: ${event.item.name} dengan rarity: ${event.item.rarity.name}")

    }
}