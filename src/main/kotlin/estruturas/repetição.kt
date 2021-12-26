package estruturas

fun main() {

    val msg = "KOTLIN" //cifra de criptografia de cesar resultado NRWOLQ
    val offset = 3
/**
    for (c in msg){
        var i = c.toInt() + offset
        var r = i.toChar()
        print(r)
    } */

    for (j in 0..msg.length - 1 step 1){
        var i = msg[j].toInt() + offset
        var r = i.toChar()
        print(r)
    }
}