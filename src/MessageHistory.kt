class MessageHistory() {
    var msgArray: MutableList<Message<String>> = mutableListOf()
    fun addToHistory(message: Message<String>){
        msgArray.addLast(message)
        println("Сообщение типа ${message.type} с текстом ${message.text} добавлено в историю")
    }
    fun getHistory(){
        for (elem in msgArray){
            println("Сохраненное сообщение: TYPE='${elem.type}', TEXT='${elem.text}'")
        }
    }
}