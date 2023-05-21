import AnsiEHelper.printlnAnsi
import org.junit.Assert

class MainKtTest {
    @org.junit.Test
    fun firstTest() {
        printlnAnsi("Test started")
        Assert.assertEquals("2*2=4", 2 * 2, 4)
        printlnAnsi("Test finished",AnsiEConstants.AnsiEnum.PURPLE)
    }
}