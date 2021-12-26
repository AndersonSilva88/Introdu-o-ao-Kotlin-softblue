package collections

fun main() {

    //var l = listOf("A", "B", "C", "D")
    //var l = mutableListOf("A", "B", "C", "D")
    //var l = setOf("A", "B", "C", "D")

   // l.forEach({ println(it) })

    var m = mapOf(1 to "A", 2 to "B", 3 to "C")

    m.forEach({ k, v -> println("$k --> $v") })
}