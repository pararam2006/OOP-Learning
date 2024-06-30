package messages

import Message
import Recipient
import types.DeliveryMethodType
import types.MessageType

class ImageMessage(
    override val text: String,
    override val type: MessageType = MessageType.IMAGE,
    val imagePath: String
): Message<String>{
    override fun sendTo(recipient: Recipient, method: DeliveryMethodType) {
        println("Отправка картинки с текстом $text")
    }
}