import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun should_ReturnPercentageOfARepetitions_when_InputHaveAB() {
        // given list of character with true condition
        val list = listOf("a", "b", "b")

        // when find the percentage of A repetitions
        val percentageResult = percentageListOfCharacters(list)

        // then test this case
        assertEquals(33.3, percentageResult)
    }

    @Test
    fun should_ReturnMinusOne_when_InputHaveABAndOtherCharacter() {
        // given list of character with false condition
        val list = listOf("a", "b", "b", "c", "z", "2")

        // when not found the percentage of A repetitions
        val percentageResult = percentageListOfCharacters(list)

        // then test this case
        assertEquals(-1.0, percentageResult)
    }

    @Test
    fun should_ReturnException_when_InputListIsEmpty() {
        // given empty list of character
        val list = listOf<String>()

        // when find exception
        val percentageResult = percentageListOfCharacters(list)

        // then test this case
        assertEquals(-1.0, percentageResult)
    }

    @Test
    fun should_ReturnPercentageOfARepetitions_when_InputListA() {
        // given list of just A character
        val list = listOf("a", "a", "a", "a", "A")

        // when find the percentage of A
        val percentageResult = percentageListOfCharacters(list)

        // then test this case
        assertEquals(80.0, percentageResult)
    }

    @Test
    fun should_ReturnZeroPercentageOfARepetitions_when_InputListWithoutA() {
        // given list without A character
        val list = listOf("b", "b")

        // when have no percentage of A
        val percentageResult = percentageListOfCharacters(list)

        // then test this case
        assertEquals(0.0, percentageResult)
    }

}