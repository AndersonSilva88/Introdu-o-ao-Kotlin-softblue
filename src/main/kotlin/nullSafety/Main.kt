package nullSafety

fun main() {
    var s : String? = "abcd"

    //if (s != null) print(s.toUpperCase())

    s = null
    print(s?.length ?: 0)
}

