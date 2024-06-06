class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        val firstWord = if(kotlin.random.Random.nextBoolean()) "Hi!" else "Hello"

        return "$firstWord Guess what this is! ${platform.name.reversed()}!"
    }
}