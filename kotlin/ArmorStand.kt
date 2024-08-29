package ****************

import org.bukkit.Location
import org.bukkit.entity.ArmorStand

class ArmorStand {
    fun summonMarker(location: Location, name: String, tag: String = ""): ArmorStand {
        val world = location.world
        val armorStand: ArmorStand = world!!.spawn(location, org.bukkit.entity.ArmorStand::class.java)

        // アーマースタンドの設定
        armorStand.isVisible = false // 可視化するかどうか
        armorStand.isSmall = true // サイズを小さくするかどうか
        armorStand.isInvulnerable = true
        armorStand.customName = name
        armorStand.isCustomNameVisible = true
        armorStand.setGravity(false)
        armorStand.isMarker = true
        armorStand.addScoreboardTag(tag)

        // 各スロットに装備を設定
        armorStand.equipment?.helmet = ItemStack(Material.DIAMOND_HELMET) // ヘルメット
        armorStand.equipment?.chestplate = ItemStack(Material.DIAMOND_CHESTPLATE) // チェストプレート
        armorStand.equipment?.leggings = ItemStack(Material.DIAMOND_LEGGINGS) // レギンス
        armorStand.equipment?.boots = ItemStack(Material.DIAMOND_BOOTS) // ブーツ
        armorStand.equipment?.setItemInMainHand(ItemStack(Material.DIAMOND_SWORD)) // メインハンド
        armorStand.equipment?.setItemInOffHand(ItemStack(Material.SHIELD)) // オフハンド
        
        return armorStand
    }
}
