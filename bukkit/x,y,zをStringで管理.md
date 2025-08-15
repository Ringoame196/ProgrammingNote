[入力値] x:1y:2z:3
```kotlin
    fun parseCoordinates(input: String?): Triple<Int, Int, Int>? {
        val regex = Regex("""x:(\d+)y:(\d+)z:(\d+)""")
        val matchResult = regex.find(input ?: return null)

        return matchResult?.let {
            val (x, y, z) = it.destructured
            Triple(x.toInt(), y.toInt(), z.toInt())
        }
    }
```
