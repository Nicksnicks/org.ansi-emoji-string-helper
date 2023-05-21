object AnsiEConstants {

    object AnsiStrings {
        const val AS_RESET = "\u001B[0m"
        const val AS_BLACK = "\u001B[30m"
        const val AS_RED = "\u001B[31m"
        const val AS_GREEN = "\u001B[32m"
        const val AS_YELLOW = "\u001B[33m"
        const val AS_BLUE = "\u001B[34m"
        const val AS_PURPLE = "\u001B[35m"
        const val AS_CYAN = "\u001B[36m"
        const val AS_WHITE = "\u001B[37m"
    }


    enum class AnsiEnum(val s: String) {
        BLACK(AS_BLACK),
        RED(AS_RED),
        GREEN(AS_GREEN),
        YELLOW(AS_YELLOW),
        BLUE(AS_BLUE),
        PURPLE(AS_PURPLE),
        CYAN(AS_CYAN),
        WHITE(AS_WHITE),
    }


    object E {
        const val LIGHTNING = "⚡"
        const val DEVIL = "\uD83D\uDE08"
        const val SAD_DEVIL = "\uD83D\uDC7F"
        const val FIRE = "\uD83D\uDD25"
        const val DRAGON = "\uD83D\uDC09"
        const val AIM = "\uD83C\uDFAF"
        const val BLACK_GLASSES = "\uD83D\uDD76"
    }
}