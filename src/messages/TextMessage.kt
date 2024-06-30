package messages

import Message
import types.MessageType
import Recipient
import types.DeliveryMethodType

class TextMessage(
    override val text: String,
    override val type: MessageType = MessageType.TEXT,
) : Message<String> {
    override fun sendTo(recipient: Recipient, method: DeliveryMethodType) {
        println("Отправка текстового сообщения '$text'")
    }
}