package section6

fun main(){
    println(reverseAString("hi"))
}

private fun reverseAString(s: String): String{
    if (s.isEmpty() || s.length < 2) return "Not reversible"
    return s.reversed()
}