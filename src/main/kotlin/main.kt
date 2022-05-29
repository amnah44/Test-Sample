import java.text.DecimalFormat

fun main() {
    val listCharacters = listOf("a", "b", "b")
    println(percentageListOfCharacters(listCharacters))
}

fun percentageListOfCharacters(listCharacters: List<String>) =
    if (
        listCharacters.all { it.lowercase() == "a" || it.lowercase() == "b" }
        && !listCharacters.isNullOrEmpty()
    ) {
        val count = listCharacters.count { it == "a" }
        DecimalFormat("#.#")
            .format(
                count * 100 / listCharacters.size.toDouble()
            ).toDouble()
    } else -1.0

