```kotlin
import com.github.ringoame196_s_mcPlugin.Data
import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.entities.MessageEmbed
import net.dv8tion.jda.api.entities.User
import org.bukkit.plugin.Plugin
import java.awt.Color
import java.time.temporal.TemporalAccessor

/*
  repositories {
    maven(url = "https://m2.dv8tion.net/releases")
  }

  dependencies {
    val jdaVersion = "4.4.0_350"
    shadowImplementation("net.dv8tion:JDA:$jdaVersion") // JDA
  }
*/


class DiscordManager {
    fun bootBOT(plugin: Plugin) {
        val config = plugin.config // configファイル
        val token = config.getString("token") // botToken
        val activityName = config.getString("activity") ?: "Minecraft" // activity
        val activity = Activity.playing(activityName)

        if (token != null && token != "") {
            val jdaBuilder = JDABuilder.createDefault(token)
            jdaBuilder.setActivity(activity) // アクティビティを設定
            Data.JDA = jdaBuilder.build() // 起動する
        } else {
            val message = "[エラー]tokenが未設定です"
            println(message)
        }
    }

    fun makeEmbed(title: String,titleURL:String? = null, color: Color? = null, descriptor: String? = null, image: String? = null, author: User? = null, footer: String? = null, thumbnail: String? = null, timestamp: TemporalAccessor? = null, fields: MutableList<MessageEmbed.Field>? = null): MessageEmbed {
        val embed = EmbedBuilder()
        embed.setTitle(title, titleURL) // タイトル
        embed.setDescription(descriptor) // 説明
        embed.setColor(color) // カラー
        embed.setImage(image) // 画像
        embed.setFooter(footer) // フッター
        embed.setThumbnail(thumbnail) // サムネ
        embed.setTimestamp(timestamp) // タイムスタンプ

        if (fields != null) { // フィールドを追加
            for (field in fields) {
                embed.addField(field)
            }
        }

        if (author != null) {
            val userName = author.name
            val iconURL = author.avatarUrl
            embed.setAuthor(userName, null, iconURL) // author
        }

        return embed.build()
    }
}
```

## JDAが起動するまで待つ
```kotlin
jda.awaitReady()
```
