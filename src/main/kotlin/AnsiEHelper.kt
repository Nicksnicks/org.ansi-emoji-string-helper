object AnsiEHelper : AnsiEHelperInterface {


    override fun String.ansiColoredString(ansi: AnsiEConstants.AnsiEnum): String {
        return "${ansi.s}$this${AnsiEConstants.AnsiStrings.AS_RESET}"
    }

    override fun printlnAnsi(s: String, ansi: AnsiEConstants.AnsiEnum) {
        println(s.ansiColoredString(ansi))
    }

    override fun printAnsi(s: String, ansi: AnsiEConstants.AnsiEnum) {
        print(s.ansiColoredString(ansi))
    }


}