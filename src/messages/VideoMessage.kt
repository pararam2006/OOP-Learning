package messages

import Message
import Recipient
import types.DeliveryMethodType
import types.MessageType

class VideoMessage(
    override val text: String,
    override val type: MessageType = MessageType.VIDEO,
    val videoPath: String,
    val duration: Int,
): Message<String> {
    override fun sendTo(recipient: Recipient, method: DeliveryMethodType) {
        println("Отправка видеосообщения $text: продолжительность $duration сек. ")
    }
}