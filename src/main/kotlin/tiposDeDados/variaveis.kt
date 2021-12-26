package tiposDeDados

fun main() {

    var numero: Int
    numero = 10
    println(numero)

    var notas: Array<Double>
    notas = arrayOf(8.5, 9.0, 6.5, 7.6)

    for (i in notas){
       // println("O Aluno tirou "+ i +" na prova") em Java
        println("O Aluno tirou $i na prova")

    }

}

