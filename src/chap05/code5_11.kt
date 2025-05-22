package chap05

fun main() {
    val h: Int = 8
    val message1 = "本日働いた時間は${h}hours"
    val message2 = "このペースで1ヶ月毎日働くと、${h * 30}の労働となります。"
    val message3 = "このペースで1年間毎日働くと、${h * 365}の労働となります。"
    println(message1)
    println(message2)
    println(message3)
}