import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.function.Executable
import java.lang.Exception

internal class MainKtTest {

    @Test
    fun should_ReturnPercentageOfARepetitions_when_InputHaveAB() {
        // given list of character with true condition
        val list = mutableListOf('a', 'b', 'b')

        // when find the percentage of A repetitions
        val percentageResult = percentageListOfCharacters(list)

        // then test this case
        assertEquals(33, percentageResult)
    }

    @Test
    fun should_ReturnMinusOne_when_InputHaveABAndOtherCharacter() {
        // given list of character with false condition
        val list = mutableListOf('a', 'b', 'b', 'c', 'z', '2')

        // when not found the percentage of A repetitions
        val percentageResult = percentageListOfCharacters(list)

        // then test this case
        assertEquals(-1, percentageResult)
    }

    @Test
    fun should_ReturnException_when_InputListIsEmpty() {
        // given empty list of character
        val list = mutableListOf<Char>()

        // when find exception
        val executableResult = Executable { percentageListOfCharacters(list) }

        // then test this case
        assertThrows(Exception::class.java, executableResult)
    }

    @Test
    fun should_ReturnPercentageOfARepetitions_when_InputListA() {
        // given list of just A character
        val list = mutableListOf('a', 'a', 'a', 'a', 'a')

        // when find the percentage of A
        val percentageResult = percentageListOfCharacters(list)

        // then test this case
        assertEquals(100, percentageResult)
    }

    @Test
    fun should_ReturnZeroPercentageOfARepetitions_when_InputListWithoutA() {
        // given list without A character
        val list = mutableListOf('b', 'b')

        // when have no percentage of A
        val percentageResult = percentageListOfCharacters(list)

        // then test this case
        assertEquals(0, percentageResult)
    }

}