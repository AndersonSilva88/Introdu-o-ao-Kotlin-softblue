package casting

fun main() {
    var auto : Automovel = Automovel()

    auto.abrirPorta()

    var auto2 : Automovel = auto as Automovel
    auto2.abrirPorta()

}

open class Veiculo {

}

class Automovel : Veiculo() {
    fun abrirPorta(){
        println("Abrir a porta")
    }
}
