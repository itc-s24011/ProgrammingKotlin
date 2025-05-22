package chap07

fun main(){
    val delicious = false
    val cheep = true
    println("このレストランはおいしい:$delicious")
    println("このレストランは安い:$cheep")
    val letsEat = delicious && cheep
    println("食事をする:$letsEat")
}