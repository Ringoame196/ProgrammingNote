```kotlin
fun make() {
  val currentPath = File(".").canonicalPath
  val targetFile = File("$currentPath/$configPath")
  val resourceStream: InputStream? = object {}.javaClass.getResourceAsStream("/config.yml")
  if (resourceStream == null) {
    println("リソースファイルが見つかりません: config.yml")
    return
  }
  Files.copy(resourceStream, targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING)
  println("設定ファイルの生成完了")
}

fun acquisitionData() {
  val fileData = yamlManager.loadYAsMap(configPath)
  val config = Config(
    fileData["token"],
  )
  Data.config = config
}
```
