package lambda

fun main() {

    var itens = arrayOf(
        Item("Toalho", 35.0),
        Item("Xícara", 11.0),
        Item("Mesa", 430.0),
        Item("Faca", 25.0),
        Item("Cadeira", 90.0)
    )

    var r = itens

    var s = itens.filter { item -> item.preco < 50 }
        .sortedBy { item -> item.preco  }

    s.forEach { item -> println("${item.nome} ==> ${item.preco}") }
    println()
    r.forEach { item -> println("${item.nome} ==> ${item.preco}")  }

}

data class Item(val nome: String, val preco: Double)