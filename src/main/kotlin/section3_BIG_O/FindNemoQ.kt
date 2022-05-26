package section3_BIG_O

fun main(){
    val listOfNames = listOf("Emma","Emi","Solo","Tari")
    val result = findNemo(listOfNames)
    println(result)
}

fun findNemo(list: List<String>): String{
    for (i in list){
        if (i == "Nemo") return "Found Nemo"
    }
    return "Nemo not Found"
}