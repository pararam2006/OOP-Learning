import types.DeliveryMethodType
import types.MessageType

interface Message<T> {
    val text: T
    val type: MessageType
    fun sendTo(recipient: Recipient, method: DeliveryMethodType)
}
