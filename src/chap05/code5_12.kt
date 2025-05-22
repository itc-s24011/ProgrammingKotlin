package chap05

fun main(){
    val message1 = "こんにちは世界!\n"
    "私はKotolinに対して勉強してます\n"
    "皆さん、一緒に楽しくプログラミングをしましょう！\n"
    println(message1)
    println("-----")
    val message2 = """
        こんにちは世界!
        私はKotolinに対して勉強してます
        皆さん、一緒に楽しくプログラミングをしましょう！
    """.trimIndent()
    println(message2)
    println("-----")
    val world = "世界!"
    val message3 = """
        こんにちは,${world}
        Kotolinでは、とても簡潔なプログラムを書くことが出来ます。
        皆さん、一緒に楽しくプログラミングをしましょう！
    """.trimIndent()
    println(message3)
}