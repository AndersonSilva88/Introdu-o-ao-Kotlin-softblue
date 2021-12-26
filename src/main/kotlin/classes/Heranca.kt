package classes

fun main() {

    var a : Animal = Cacharro("Rex")
    println(a.nome)
    a.falar()


    var c = Cacharro("Shon")
    println(c.nome)
    c.falar()
    c.corre()
}

abstract class Animal(var nome: String) {
    abstract fun falar()
}

class Cacharro(nome : String) : Animal(nome), correr{
    override fun falar() {
        println("AU-AU")
    }
    override fun corre(){
        println("Correndo....")
    }
}

interface correr {
    fun corre()
}

