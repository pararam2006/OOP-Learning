package messages

import Message
import types.MessageType
import Recipient
import types.DeliveryMethodType

class VoiceMessage(
    override val text: String,
    override val type: MessageType = MessageType.VOICE,
    val audioPath: String,
    val duration: Int
): Message<String> {

    override fun sendTo(recipient: Recipient, method: DeliveryMethodType) {
        println("Отправка голосового сообщения: $text, продолжительность $duration сек.")
    }
}