import AnsiEConstants.AnsiEnum

interface AnsiEHelperInterface {
    fun printlnAnsi(s: String, ansi: AnsiEnum = AnsiEnum.GREEN)
    fun printAnsi(s: String, ansi: AnsiEnum = AnsiEnum.GREEN)
    fun String.ansiColoredString(ansi: AnsiEnum = AnsiEnum.GREEN): String
}


