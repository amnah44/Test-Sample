fun main() {
    val listCharacters = mutableListOf('a','b','b')
    println(percentageListOfCharacters(listCharacters))
}

fun percentageListOfCharacters(listCharacters: List<Char>): Any {
    return if (listCharacters.all { it == 'a' || it == 'b' }) {
        val count = listCharacters.count { it == 'a' }
        count * 100 / listCharacters.size
    } else {
        -1
    }


}