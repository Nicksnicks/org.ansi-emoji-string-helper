import AnsiEConstants.E.AIM
import AnsiEConstants.E.BLACK_GLASSES
import AnsiEConstants.E.DEVIL
import AnsiEConstants.E.DRAGON
import AnsiEConstants.E.FIRE
import AnsiEConstants.E.FOUR_LEAF_CLOVER
import AnsiEConstants.E.LIGHTNING
import AnsiEConstants.E.SAD_DEVIL
import AnsiEHelper.printlnAnsi
import org.junit.Assert

class MainKtTest {
    @org.junit.Test
    fun firstTest() {
        printlnAnsi("Test started")
        Assert.assertEquals("2*2=4", 2 * 2, 4)
        printlnAnsi("Test finished", AnsiEConstants.AnsiEnum.PURPLE)
    }



    @org.junit.Test
    fun emojiPrintingTest() {
        //// todo unfortunately doesn't work in default test console. we can test it with writing in txt, though
        printlnAnsi("Test started")
        println("LIGHTNING is $LIGHTNING")
        printlnAnsi("DEVIL is $DEVIL")
        printlnAnsi("SAD_DEVIL is $SAD_DEVIL")
        printlnAnsi("FIRE is $FIRE")
        printlnAnsi("DRAGON is $DRAGON")
        printlnAnsi("AIM is $AIM")
        printlnAnsi("BLACK_GLASSES is $BLACK_GLASSES")
        printlnAnsi("c is $FOUR_LEAF_CLOVER")
        printlnAnsi("Test finished", AnsiEConstants.AnsiEnum.PURPLE)

    }

}