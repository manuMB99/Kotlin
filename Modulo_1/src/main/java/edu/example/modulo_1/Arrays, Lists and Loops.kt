package edu.example.modulo_1

fun main(){
    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")

    val school2 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school2))

    val mix = arrayOf("fish", 2)

    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])

    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))

    val school3 = arrayOf("shark", "salmon", "minnow")
    for (element in school3) {
        print(element + " ")
    }

    for ((index, element) in school3.withIndex()) {
        println("Item at $index is $element\n")
    }

    for (i in 1..5) print(i)

    for (i in 5 downTo 1) print(i)

    for (i in 3..6 step 2) print(i)

    for (i in 'd'..'g') print (i)

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }

}