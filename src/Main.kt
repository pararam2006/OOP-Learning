import messages.ImageMessage
import messages.TextMessage
import messages.VideoMessage
import messages.VoiceMessage
import types.DeliveryMethodType
import types.MessageType

fun main(){
    val msgHistory = MessageHistory()
    val recipientJohn = Recipient("John", "email1@ya.ru", "128309812309", 1)
    val recipientMarcus = Recipient("Marcus", "email2@ya.ru", "1233444123421", 2)
    val voiceMSG = VoiceMessage("Голосовуха", MessageType.VOICE, "Путь до ГС", 183)
    val textMSG = TextMessage("Обычное сообщение", MessageType.TEXT)
    val videoMSG = VideoMessage("Видеосообщение", MessageType.VIDEO, "Путь до видео", 13)
    val imageMSG = ImageMessage("Текст картинки", MessageType.IMAGE, "Путь до картинки")

    //Отправка сообщений
    voiceMSG.sendTo(recipientMarcus, DeliveryMethodType.SMS)
    textMSG.sendTo(recipientJohn, DeliveryMethodType.PUSH)
    videoMSG.sendTo(recipientMarcus, DeliveryMethodType.EMAIL)
    imageMSG.sendTo(recipientJohn, DeliveryMethodType.MESSENGER)

    println()

    //Добавление сообщений в историю
    msgHistory.addToHistory(voiceMSG)
    msgHistory.addToHistory(textMSG)
    msgHistory.addToHistory(videoMSG)
    msgHistory.addToHistory(imageMSG)

    println()

    //Показ истории сообщений
    msgHistory.getHistory()
}
