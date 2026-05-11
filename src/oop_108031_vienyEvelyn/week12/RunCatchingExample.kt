package oop_108031_vienyEvelyn.week12

package oop_001_johnthor.week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

}