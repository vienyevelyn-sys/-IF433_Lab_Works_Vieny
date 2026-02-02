package oop_108031_vienyEvelyn.week01

fun main(args: Array<String>) {

    val radius: Double = 7.0
    val pi: Double = 3.14
    var area = pi * radius * radius

    println("Radius:  $radius , Area: $area")
    var result = checkSize(area)
    println("Result: $result")
}

/*
fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    }
    else{
        println("This is a Small Circle")
    }
}*/

fun checkSize(area: Double) = if (area > 100) "This is Big Circle" else "This is Small Circle"