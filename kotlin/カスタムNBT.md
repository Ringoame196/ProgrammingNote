```kotlin
class PersistentDataContainer(private val plugin: Plugin) {
    fun setCustomNBT(entity: Entity, key: String, value: String) {
        val container = entity.persistentDataContainer
        val namespacedKey = NamespacedKey(plugin, key)
        container.set(namespacedKey, PersistentDataType.STRING, value)
    }

    fun acquisitionCustomNBT(entity: Entity, key: String): String? {
        val container = entity.persistentDataContainer
        val namespacedKey = NamespacedKey(plugin, key)
        return container.get(namespacedKey, PersistentDataType.STRING)
    }
}
```
