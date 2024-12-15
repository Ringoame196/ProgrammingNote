package ********

import org.bukkit.scheduler.BukkitRunnable

object Timer : BukkitRunnable() {
    private val cpsGameManager = CpsGameManager()

    override fun run() {
        val iterator = Data.gameData.entries.iterator()
        while (iterator.hasNext()) {
            val entry = iterator.next()
            val player = entry.key
            val remaining = entry.value.time - 1
            if (remaining <= 0) {
                cpsGameManager.endGame(player)
            } else {
                DataManager.setTime(player, remaining)
                entry.value.bossBar.update(remaining)
            }
        }
    }
}

// Main.kt
Timer.runTaskTimer(plugin, 0L, 20L)
