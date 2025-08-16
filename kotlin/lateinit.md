```kotlin
lateinit var jda: JDA

fun shutdown() {
    if (::jda.isInitialized) {
        
    }
}

```

Kotlin 特有の **`lateinit` プロパティ``** に対するチェック方法

`lateinit` で定義されたプロパティが「初期化されているかどうか」を調べる式
