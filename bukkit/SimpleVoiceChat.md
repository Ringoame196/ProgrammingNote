```kotlin
/*
  repositories {
      maven(url = "https://maven.maxhenkel.de/repository/public")
  }

  dependencies {
    compileOnly("de.maxhenkel.voicechat:voicechat-api:2.5.27")
  }

  depend = listOf("voicechat")
*/

/* Main
  import de.maxhenkel.voicechat.api.BukkitVoicechatService

  val service: BukkitVoicechatService? = server.servicesManager.load(BukkitVoicechatService::class.java)

        if (service != null) {
            val voicechatPlugin = ExampleVoiceChatPlugin()
            service.registerPlugin(voicechatPlugin)
            logger.info("Successfully registered example plugin")
        } else {
            logger.info("Failed to register example plugin")
        }
*/

package ***********

import de.maxhenkel.voicechat.api.VoicechatApi
import de.maxhenkel.voicechat.api.VoicechatPlugin
import de.maxhenkel.voicechat.api.events.EventRegistration
import de.maxhenkel.voicechat.api.events.MicrophonePacketEvent

class ExampleVoiceChatPlugin : VoicechatPlugin {
    /**
     * @return the unique ID for this voice chat plugin
     */
    override fun getPluginId(): String {
        return "pluginName"
    }

    /**
     * Called when the voice chat initializes the plugin.
     *
     * @param api the voice chat API
     */

    override fun initialize(api: VoicechatApi?) {
    }

    /**
     * Called once by the voice chat to register all events.
     *
     * @param registration the event registration
     */

    override fun registerEvents(registration: EventRegistration?) {
        // registration?.registerEvent(MicrophonePacketEvent::class.java, this::onMicrophonePacket)
    }

    private fun onMicrophonePacket(e: MicrophonePacketEvent) {}
}
```
