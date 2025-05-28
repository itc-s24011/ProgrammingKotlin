package chap30

open class Prius(val color: String) {
    var distance = 0.0
    open fun drive(d:  Double) {
        this.distance += d
        println("${color}のプリウスが走っています！スィーン！")
        println("すごい静かですね")
        println("マイレージは ${distance}キロです。")
        println("トヨタの車はいっぱい走ってもなかなか故障しません！")
    }
}