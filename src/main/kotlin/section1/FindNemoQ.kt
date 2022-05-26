package section1

fun findNemo(list: List<String>): String{
    var result = ""
    for (i in list){
        result = if (i == "Nemo") "Found Nemo" else "Nemo not found"
    }
    return result
}