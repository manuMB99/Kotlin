package edu.example.modulo_1

fun main(){
    val i:Int = 6
    val b1 = i.toByte()
    println(b1)

    val b2: Byte = 1 // OK, literals are checked statically
    println(b2)

    val i4: Int = b2.toInt() // OK!
    println(i4)

    val i5: String = b2.toString()
    println(i5)

    val i6: Double = b2.toDouble()
    println(i6)

    val numberOfFish = 5
    val numberOfPlants = 12
    "I have $numberOfFish fish" + " and $numberOfPlants plants"

}